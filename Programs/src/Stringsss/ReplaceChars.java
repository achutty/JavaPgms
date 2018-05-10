package Stringsss;

public class ReplaceChars 
{

	public static void main(String[] args) 
	{
		String s="ThinkCentre";
		char[] ch = s.toCharArray();
	char	removChar= 'n';
	for(int i =0;i<ch.length;i++)
	{
		if(ch[i]==removChar)
		{
			ch[i]=' ';
		}
	}
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!=' ')
		{
			System.out.print(ch[i]);
		}
		
	}

	}

}
