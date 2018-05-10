package arrays;

public class IntersectionArray
{

	public static void main(String[] args)
	{
		int[] a={1,2,3};
		int[] b={2};
		int size=a.length+b.length;
		int k=0;
		int len=0;
		int [] c=new int[size];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k]=a[i];
					k++;
				}
				len=k;
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(c[i]);
		}

	}

}
