package numbers;

public class _4_NumberOf_Digits {

	public static void main(String[] args) {

		
		int num = 12345;
		
		int count=0;
		
		for(int i= num;i>0;i=i/10) 
		{
			count++;
		}
		
		System.out.println("Number of Digits in Number is = "+count);
	
	
	}

}
