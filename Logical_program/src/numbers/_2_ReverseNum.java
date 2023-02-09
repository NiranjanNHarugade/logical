package numbers;


public class _2_ReverseNum {

	public static void main(String[] args) {


		int num = 12345;	
		int rev = 0;

		
//		Method 1 - Using modulus.
		for(int i= num;i>0;i=i/10)	 // 12345,1234,123,12,1.
		{
			int a=i%10;				 // 5,4,3,2,1.
			
			rev=rev*10+a;			 // 5,54,543,5432.54321.
			
		}
		
		
		System.out.println("Reverse of Integer is = "+rev);
		System.out.println("-----------------------------------------------");

		
		
		
		//		Method 2 - Using String.
		
		String value=Integer.toString(num);				//Convert int to string.
		String Rev="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			Rev=Rev+value.charAt(i);
		}
		
		int Reverse_value=Integer.parseInt(Rev);		//Convert string to int.
		
		System.out.println("Reverse Integer using String = "+Reverse_value);
		
		
		
	}

}
