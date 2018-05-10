package arrays;

import java.util.Scanner;

public class RemoveAnElementarray
{

	public static void main(String[] args)
	{
		int a[]={2,4,8,7,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be removed");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=n)
			{
				System.out.println(a[i]);
			}
		}
		
		}

}
