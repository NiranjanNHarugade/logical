package numbers;

public class _5_Numberof_OddEvenNumbers {

	public static void main(String[] args) {


		int num = 122344556;
		
		int OddCount=0;
		int EvenCount=0;
		
		
		for(int i= num;i>0;i=i/10) 
		{	int X=i%10;
		
			if(X%2==0) {EvenCount++;}
			else {OddCount++;}
		}
		
		System.out.println("Count of Even Numbers = "+ EvenCount);
		System.out.println("Count of Odd Numbers = "+ OddCount);
		

	}

}
