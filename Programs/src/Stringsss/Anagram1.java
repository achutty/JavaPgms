package Stringsss;

public class Anagram1 {

	public static void main(String[] args) {
		String s1="Computer";
		String s2="puteromC";
		if(s1.length()==s2.length())
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
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

