package numbers;

public class Reverse
{

	public static void main(String[] args)
	{
		int n=1989;
		int x=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println(rev);
	}

}
