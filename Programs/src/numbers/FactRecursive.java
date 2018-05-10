package numbers;

public class FactRecursive
{

	public static void main(String[] args)
	{
		int n=fact(4);
		System.out.println(n);
	}
	
		
		static int fact(int n)
		{
			if(n==1)
			{
				return 1;
			}
			else
			{
			return n*fact(n-1);
			}
		}
		
		
	}


