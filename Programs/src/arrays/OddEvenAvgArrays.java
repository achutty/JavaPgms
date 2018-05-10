package arrays;

public class OddEvenAvgArrays
{

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9};
		int [] o=new int[a.length];
		int [] e=new int[a.length];
		int k=0;
		int l=0;
		int sizeo=0;
		int sizee=0;
		int sumo=0;
		int sume=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				o[k]=a[i];
				k++;
			}
			
			else
			{
				e[l]=a[i];
				l++;
			}
			 sizeo=k;
			 sizee=l;
		}
		System.out.println("the odd array is:");
		for(int i=0;i<sizeo;i++)
		{
			sumo=sumo+o[i];
			System.out.println(o[i]);
		}
		System.out.println("the avg of odd array is  "+sumo/sizeo);
		System.out.println("the even array is:");
		for(int i=0;i<sizee;i++)
		{
			sume=sume+e[i];
			System.out.println(e[i]);
		}
		System.out.println("the avg of even array is   "+sume/sizeo);

	}

}
