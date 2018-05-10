package Stringsss;

import java.util.HashMap;

public class MostRepeatedWord 
{

	public static void main(String[] args) 
	{
		String s="right now im am in a dilemma ! should i attend the marriage or not ! im confused !";
		String[] arr=s.split(" ");
		System.out.println(arr.length);
		int count=0;
		String[] countArr=new String[19];
		HashMap<String,String> hp=new HashMap<String,String>();
		for(int i=0;i<arr.length-1;i++)
		{
			hp.put(arr[i], countArr[i]);
		}
	}

}
