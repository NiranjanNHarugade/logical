package array_example;

import java.util.Arrays;

public class _1_SumOf_ArrayElments {

	public static void main(String[] args) {
		
		
//		int ar[]=new int [8];
		
		int ar[]= {10,12,15,16,18,20};
		int sum=0;
		
		for(int i=0;i<ar.length;i++) 
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum of all Elements is = "+sum);
		
//		Arrays Printing Methods
		for(int n:ar) {System.out.print(n+",");}
		System.out.println("\n"+Arrays.toString(ar));
		
		
	}

}
