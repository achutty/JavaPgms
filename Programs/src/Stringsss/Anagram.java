package Stringsss;

public class Anagram 
{

	public static void main(String[] args)
	{
		String s1="Computer";
		String s2="puteromC";
		if(s1.length()==s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			int count=0;
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						count++;
						
					}
					else
					{
						continue;
						
					}
				
				}
				
			}
			if(count==8)
			{
				System.out.println("its anagram");
			}
			else{System.out.println("not anagram");}
		}
		
		
	}

}
