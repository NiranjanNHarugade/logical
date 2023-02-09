package numbers;

public class _9_PrimeNumbers {

	public static void main(String[] args) {
	
//		Prime Numbers = Number divided by 1 and itself only.
		
		int num = 7;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {count++;}
		}
		
		
		if (count==2) {System.out.println(num+" -- Is Prime Number");}
		else {System.out.println(num+" -- Is Not Prime Number");}
		
		
		
		PrimeRange();
		
		
		
	}
	
	
	
	// List Of Prime Numbers From range
	
		public static void PrimeRange() 
		{
		
			int A=0, B=1000;
			
			int PrimeCount=0;
			
			for(int num=A;num<=B;num++)
			{  
				int count=0;
				for(int i=1;i<=num;i++)
				{
					if(num%i==0) {count++;}
				}
								
				
				if(count==2)
				{	System.out.println(num+" Is Prime Number");
					PrimeCount++;
				}
			}
			
			System.out.println("Count Of Prime Numbers in Between "+A+" And "+B+" Is = "+PrimeCount);
		
			
			
		}

}
