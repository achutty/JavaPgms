package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductCodePrint
{

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put( 101,"apple");
		hm.put( 102,"orange");
		hm.put( 103,"kiwi");
		hm.put( 104,"mango");
		System.out.println(" the choices are apple, orange, mango and kiwi---choose one!!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		String s=sc.nextLine();
		
		for(Entry<Integer, String>h:hm.entrySet())
		{
			if(h.getValue().equals(s))
			{
			System.out.println(h.getKey());
			}
			else
			{
				//System.out.println("invalid selection");
			}
		}
	}

}
