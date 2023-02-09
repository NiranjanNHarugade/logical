package string;

import java.util.HashMap;

public class _4_Count_InCharacters {

	public static void main(String[] args) {

		
		
		
		String name = "My name @@@@@@ is Niranjan";
		
		String x=name.replace(" ", "").toUpperCase();
		HashMap <Character,Integer> Map = new HashMap <Character,Integer>();
		
		for(int i=0;i<x.length();i++) 
		{	char Char=x.charAt(i);
			if(Map.containsKey(Char))
			{ 
				int count=Map.get(Char)+1; 
				Map.put(Char,count);
			}
			else {Map.put(Char, 1);}
			
		}
		System.out.println(Map);
		
		
		
		// Find occurence of "a" only
		int Beforecount = name.length();
		
		String replaced=name.replace("a", ""); 		// Replaced by blank
		int Aftercount=replaced.length();
		
		System.out.println("Occurance of a inside String is = "+(Beforecount-Aftercount));
		
	}

}
