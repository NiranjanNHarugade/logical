package array_example;

import java.util.Arrays;
import java.util.Collections;

public class _7_SortingArrays {

	public static void main(String[] args) {

		int ar[]= {90,80,10,20,30,40};
		
		// 1 Bubble Sort -
		for(int i=0;i<ar.length-1;i++) 
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1]) 
				{	int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}System.out.println("Bubble Sort = "+Arrays.toString(ar));
		
		
		// 2 Inbuilt Sort -
		
		int AR[]= {90,80,10,20,30,40};
		Arrays.sort(AR);
		System.out.println("Inbuilt Sort = "+Arrays.toString(AR));
		
		
		// 3 Sort in Reverse order -
		Integer Ar[]= {90,80,10,20,30,40};
		Arrays.sort(Ar,Collections.reverseOrder());
		System.out.println("Reverse Sort = "+ Arrays.toString(Ar));
		
	}

}
