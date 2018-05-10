package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile
{

	public static void main(String[] args) throws Exception 
	{
		InputStream is=null;
		OutputStream os=null;
		
		try 
		{
			is=new FileInputStream("C:\\Users\\TYSS\\Desktop\\asha\\src.txt");
			os=new FileOutputStream("C:\\Users\\TYSS\\Desktop\\dest.txt");
			byte[] buffer = new byte[1024];
			int length;
			while((length=is.read(buffer))>0)
			{
				os.write(buffer, 0, length);
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			is.close();
			os.close();
		}
		
	}

}
