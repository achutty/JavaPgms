package numbers;

public class SwapSection {

	public static void main(String[] args) 
	{
		
		int arr[]={10,20,30,40,50,60};
		int size = arr.length;
		int mid = size/2;
		int temp=0;
		for(int i=0;i<size/2;i++)
		{
			temp=arr[mid];
			arr[mid]=arr[i];
			arr[i]=temp;
			mid++;
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
