package arrays;

import java.util.HashSet;

public class DupliHashSet {

	public static void main(String[] args)
	{
		int array[]={2,6,4,8,2,5,6,89,9};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int arraylist:array)
		{
				hs.add(arraylist);	
				
		}
		System.out.println(hs);
	}

}
