package arrays;

import java.util.Arrays;

public class Sort 
{

	public static void main(String[] args)
	{
	 int a[]= {8,4,2,6,4,9,1,2};
	 System.out.println(Arrays.toString(a));
	// System.out.println(Arrays.toString(a));
	 for(int i=0;i<a.length-1;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
		while(a[i]>a[j])
		 {
			 int temp = a[j];
			 a[j]=a[i];
			 a[i]=temp;
			 
		 }
		 }
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]); 
		
	 }
	 System.out.println("length is"+a.length);
	}

}
