package Stringsss;

public class SwapString {

	public static void main(String[] args) 
	{
		String s="ashamabel";
		char temp;
		char[] ch=s.toCharArray();
		int mid = ch.length/2;
		for(int i=0;i<ch.length/2;i++)
		{
			temp=ch[mid];
			ch[mid]=ch[i];
			ch[i]=temp;
			mid++;
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		//System.out.println(ch.toString());

	}

}
