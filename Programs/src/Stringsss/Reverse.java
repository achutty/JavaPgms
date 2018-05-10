package Stringsss;

public class Reverse 
{

	public static void main(String[] args) 
	{
		String s="strawberry";
		System.out.println(new StringBuffer(s).reverse().toString());
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		StringBuilder sb=new StringBuilder();
		int l=s.length();
		while(l>0)
		{
			char c=s.charAt(l-1);
			sb.append(c);
			l--;
			if(sb.equals(s))
			{
				System.out.println("pal");
				break;
			}
			else
			{
				System.out.println("not pal");
				break;
			}
		}
		System.out.print(sb);
		System.out.println();
		StringBuffer sb1=new StringBuffer();
		int ll=s.length();
		while(ll>0)
		{
			char c=s.charAt(ll-1);
			sb1.append(c);
			ll--;
		}
		System.out.println(sb1);
	}

}
