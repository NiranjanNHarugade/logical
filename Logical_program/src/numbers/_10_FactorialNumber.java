package numbers;

public class _10_FactorialNumber {
	
	public static void main(String []args) 
	{
//		Factorial = 6! = 1*2*3*4*5*6  = 720
		int num=6;
		
		int factorian = 1;
		for(int i=1;i<=num;i++) 
		{
			factorian=factorian*i;
		}
		
		System.out.println("Factorial of "+num+" Is = "+factorian);
		
	}

}
