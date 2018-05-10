package numbers;

public class Intpalindrome
{

	public static void main(String[] args) 
	{
		int x=10010;
		int n=x;
		int res=0;
		while(n>0)
		{
			
			
			int rem=n%10;
			res=res*n+rem;
			n=n/10;
			
		}
		if(res==x)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
