package numbers;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the series");
		
		int len=sc.nextInt();
		int n1=1;
		int n2=1;
		System.out.println(n1);
		System.out.println(n1);
		for(int i=0;i<len-2;i++)
		{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
