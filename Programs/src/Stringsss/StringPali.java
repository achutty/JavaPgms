package Stringsss;

public class StringPali {

	public static void main(String[] args)
	{
		String s="malayalam";
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		if(s.equals(sb.toString()))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not pali");
		}
	}

}
