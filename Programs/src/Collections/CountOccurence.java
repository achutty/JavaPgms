package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccurence
{

	public static void main(String[] args)
	{
		int a[]={2,3,4,2,7,5,7,8,2,2,2};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//int count=0;
		for(int i=0;i<a.length;i++)
		{
			int key=a[i];
			if(hm.containsKey(key))
			{
				int count=hm.get(key);
				count++;
				hm.put(key, count);
			}
			else
			{
				hm.put(key, 1);
			}
		}
		 for(Entry<Integer,Integer> val : hm.entrySet())
	        {
	            System.out.println(val.getKey() + " occurs " + val.getValue() + " time(s)");
	        }
		System.out.println(hm);
	}

}
