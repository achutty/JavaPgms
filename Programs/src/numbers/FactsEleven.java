package numbers;

public class FactsEleven
{

	public static void main(String[] args)
	{
		int n=1;;
		while( n<=100)
		{
			if(n%11==0)
			{
				System.out.println(n);
				n++;
			}
			else
			{
				n++;
			}
			
		}

	}

}
