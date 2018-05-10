package files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

public class CopyfileAndOccurence
{

	public static void main(String[] args) throws Exception 
	{
		InputStream is=null;
		OutputStream os=null;
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		try 
		{
			
			//is=new FileInputStream("C:\\Users\\TYSS\\Desktop\\asha\\src.txt");
			//os=new FileOutputStream("C:\\Users\\TYSS\\Desktop\\dest.txt");
			//byte[] buffer = new byte[1024];
			FileInputStream fis=new FileInputStream("C:\\Users\\TYSS\\Desktop\\asha\\src.txt");
			BufferedReader bis=new BufferedReader(new InputStreamReader(fis));
			String s="";
			int length;
			
			
			while((s=bis.readLine())!=null)
			{
				if(hm.containsKey(s))
				{
					length=hm.get(s);
					hm.put(s, length++);
					
				}
				else
				{
					hm.put(s, 1);
				}
				//os.write(buffer, 0, length);
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
			
		for(Entry<String,Integer>h:hm.entrySet())
		{
			System.out.println("word------>"+h.getKey()+"value----->"+h.getValue());
		}
		

	}

}
