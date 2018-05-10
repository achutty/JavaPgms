package numbers;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int pr=n;
		for(int i=2;i<n;i++)
		{
			if((n%i)==0)
			{
				
				System.out.println("not prime");
				break;
			}
			else
			{
				System.out.println("prime");
				break;
			}
		}
	}

}
