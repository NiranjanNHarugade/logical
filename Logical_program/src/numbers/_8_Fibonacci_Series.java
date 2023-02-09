package numbers;

public class _8_Fibonacci_Series {

	public static void main(String[] args) {
			int a=0, b=1;
	
			
			System.out.print(a+","+b);
			
			
		for(int i=0;i<10;i++)
		{	
			int sum =a+b;
			a=b;
			b=sum;
			System.out.print(","+sum);
		}
			
			
	}

}
