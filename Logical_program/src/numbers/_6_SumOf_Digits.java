package numbers;

public class _6_SumOf_Digits {
	
	public static void main(String[]args) {
		
		
		int num = 1122334455;
		
		int sum=0;
	
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+rem;	
		}
		
		System.out.println("Sum Of All Digits = "+sum);
		
	}

}
