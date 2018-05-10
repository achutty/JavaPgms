package arrays;

public class MiddleIndex 
{

	public static void main(String args[])
	{
		int a[]={7,1,2,7,0,1};
		int k=a.length-1;
		int sumH=0;
		int sumT=0;
		for(int i=0;i<a.length-1 && k>0;i++)
		{
				sumH=sumH+a[i];
			
				sumT=sumT+a[k];
				k--;
				System.out.println("ttt   "+sumT);
				if(sumH==sumT)
				{
					System.out.println("equal   "+ a[k-i]);
					System.exit(0);
				}
			}
			
			System.out.println("hhh   "+sumH);
			
		}
		
	
}
