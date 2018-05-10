package Stringsss;

public class RemoveSpace
{

	public static void main(String[] args) 
	{
		String s="I am going home today";
		
		char [] ch=s.toCharArray();
		
		//int j=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]!=' ')
			{
				//arr[j]=ch[i];
				System.out.print(ch[i]);
			}
		}
		
	}

}
