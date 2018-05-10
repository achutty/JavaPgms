package arrays;

import java.util.Scanner;

public class SwapRowwws {

	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		System.out.println("enter the no of rows");
		int col=sc.nextInt();
		int a[][]	=new int[row][col];
		System.out.println("enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int mid=row/2;
		for(int i=0;i<row/2;i++)
		{
			for (int j=0;j<col;j++)
			{
				int temp=a[mid][j];
				a[mid][j]=a[i][j];
				a[i][j]=temp;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			if(mid<row)
			{
				mid++;
			}
		}
			
			for(int i=row/2 ; i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		

	}

}
