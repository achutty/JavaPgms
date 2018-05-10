package arrays;

public class UnionArray
{

	public static void main(String[] args) 
	{
		int []a={1,2,3,7,9};
		int[]b={2,3,4,5,6,7};
		int[]c=new int[a.length+b.length];
		int i;
		int size=a.length+b.length;
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k=0;
	
		while(i<size)
		{
			
			c[i]=b[k];
			k++;
			i++;
		}
		for(int m=0;m<size;m++)
		{
			for(int j=m+1;j<size;j++)
			{
				if(c[m]==c[j])
				{
					c[j]=c[size-1];
					size--;
					j--;
					
				}
			}
			System.out.println(c[m]);
		}
		
	}

}
