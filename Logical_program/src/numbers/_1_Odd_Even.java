package numbers;

import java.util.Scanner;

public class _1_Odd_Even {
	
	
	static Scanner sc =new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
//		(/ -- Slash This sign gives Dividend number)

		
//		(% -- This sign shows remaining values after dividing)

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value");
		
		 int num = sc.nextInt();
		 
		if(num%2==0) {System.out.println(num+" = Is Even Number");}
		else {System.out.println(num+" = Is odd Number");}
		
		
		Even_List();
		
			
	}
	
	
	
	
	//Odd_Even Beetween range;
	public static void Even_List() {
		
		System.out.println("Enter lowest value ");
		int A= sc.nextInt();
		System.out.println("Enter highest value ");
		int B= sc.nextInt();
		int count = 0;
		
		for(int i=A;i<=B;i++)
		{
			if(i%2==0) {System.out.println(i+" = Is Even Number");
			count++;}	
		}
		
		System.out.println("Total of Even Numbers from "+A+" To "+B+" is = "+count);
	
	
	
	
	
	}

}
