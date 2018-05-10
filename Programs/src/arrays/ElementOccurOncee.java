package arrays;

public class ElementOccurOncee 
{

	public static void main(String[] args)
	{
		int [] a={4,5,6,7,4,3,5,6,7,1};
		
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			int count=0;
			
				for(int j=i+1;j<size;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						a[j]=a[size-1];
						size--;
						j--;
						
						//break;
					}
				}			
			
				
			if(count==0)
			{
				System.out.println("the element"+a[i]+"occured only once");
			}
			
		}
		

	}

}
