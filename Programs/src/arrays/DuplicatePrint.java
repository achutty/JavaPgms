package arrays;

public class DuplicatePrint 
{

	public static void main(String[] args)
	{
		int j=0;
		int a[]={3,5,2,8,7,4,8,2,8};
		//int array[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			for(int k=i+1;k<a.length;k++)
			{
				if(a[i]==a[k]&& (i!=k))
				{
					System.out.println("duplicate is"+a[i]);
					
				}	
				
			}
		}
		
		
	}

}
