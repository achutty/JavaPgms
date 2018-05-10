package numbers;

public class Factorial
{

	public static void main(String[] args) 
	{
		int n=8;
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
