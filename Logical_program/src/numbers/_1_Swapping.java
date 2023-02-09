package numbers;

public class _1_Swapping {

	public static void main(String[] args) {

		int a=10;
		int b=20;

		//Swapping 
		System.out.println("Values Before Swapping A = "+a+" And B = "+b);
		
		
		int Dummy=a;
		a=b;
		b=Dummy;
		System.out.println("Values After Swapping A = "+a+" And B = "+b);
		
		
		
		
		//Swapping Method 2
		
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("Values After Swapping A = "+a+" And B = "+b);

	}

}
