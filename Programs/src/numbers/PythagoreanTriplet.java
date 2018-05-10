package numbers;

public class PythagoreanTriplet 
{

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,12,11,13};
		int[] sqA=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			sqA[k]=a[i]*a[i];
			k++;	
		}
		
		for(int i=0;i<sqA.length;i++)
		{
			for(int j=i+1;j<sqA.length;j++)
			{
				for(int y=0;y<sqA.length;y++)
				{
					if(sqA[i]+sqA[j]==sqA[y])
					{
						
						System.out.println("the triplets are "+a[i] +"  "+a[j]+"  "+a[y]);
						
						
					}
				}
				
			}
		}
	}

}
