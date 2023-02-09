package array_example;

import java.util.ArrayList;

public class _2_Print_Even_Odd {

	public static void main(String[] args) {

		int ar[]= {10,12,15,16,18,20};
		
		ArrayList <Integer> Even= new ArrayList<Integer>();
		ArrayList <Integer> Odd= new ArrayList<Integer>();
		
		
		
		
		
	
		 
		
		for(int i=0;i<ar.length;i++)
		{	
			int values=ar[i];
		
			if(values%2==0) {Even.add(values);}
			else {Odd.add(values);}
			
		}
		
		System.out.print(Even);
		System.out.println("");
		System.out.print(Odd);
		
	}

}
