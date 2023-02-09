package array_example;

public class Array1 {

	public static void main(String[] args) {

		System.out.println("Sum of arrays");
		int [] n = {1,2,3,4,5,6,7,8,9,10};
		
		int sum =0;
		
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
			
		}
		
		System.out.println("Sum of all numbers in array is = "+ sum);
//==============================================================================
		
		System.out.println("Avg Sum of array numbers");
		int [] a = {11,12,3};
		
		double sum1 =0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
			
		}
		
		System.out.println("Sum of all numbers in array is = "+ sum1);
		double avg=(sum1/a.length);
		System.out.println("Avg Sum of all numbers in array is = "+ avg);
//==============================================================================

		
	 
	}}
			
	


