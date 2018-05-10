package Stringsss;

public class Penagram 
{

	public static void main(String[] args) 
	{
		
		String s="abcedfghjiklnmoprqstvuyxzw";
		if(s.length()>=26)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				
					for(int j=97;j<123;j++)
					{
						if(s.charAt(i)==j)
						{
							
							count++;
						}
					}
				
			}
			if(count>=26)
			{
				System.out.println("penagram");
			}
			else
			{
				System.out.println("not penagram");
			}
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
