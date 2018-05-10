package arrays;

import java.util.Arrays;

public class DuplicRemoval
{
	int arrayDup[]={3,6,1,3,5,2,7,5,1,5};
	int size=arrayDup.length;
	public  void findDuplicate()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arrayDup[i]==arrayDup[j])
				{
					arrayDup[j]=arrayDup[size-1];
					size--;
					j--;
				}
			}
		}
		int arrayNoDup[]=Arrays.copyOf(arrayDup, size);
		for(int i=0;i<arrayNoDup.length;i++)
		{
			System.out.println(arrayNoDup[i]);
		}
	}
	

	public static void main(String[] args)
	{
		DuplicRemoval dr=new DuplicRemoval();
		dr.findDuplicate();
	}

}
