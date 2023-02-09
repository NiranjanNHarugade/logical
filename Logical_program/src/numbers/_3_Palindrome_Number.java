package numbers;

public class _3_Palindrome_Number {

	public static void main(String[] args) {

		
		int num = 158276451;
		
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			rev=rev*10+i%10;
			
		}
		
		if(rev==num) {System.out.println(rev+"    Palindrome Number ");}
		else {System.out.println(rev+"    Not Palindrome Number ");}

	}

}
