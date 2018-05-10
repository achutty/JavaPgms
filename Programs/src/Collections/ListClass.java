package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListClass 
{

	public static void main(String[] args) 
	{
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("asha");
		nameList.add("bastin");
		nameList.add("ranjith");
		
		Iterator itr=nameList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
