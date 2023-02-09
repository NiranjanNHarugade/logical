package string;

public class _2_Palindrome_String {

	public static void main(String[] args) {

		
		String Name = "Madam";
		
		String rev="";
		
		for(int i=Name.length()-1;i>=0;i--)
		{
			rev=rev+Name.charAt(i);
			
		}
		
		if(Name.equalsIgnoreCase(rev)) {System.out.println(rev+" -- Palindrome String ");}
		else {System.out.println(rev+"  -- Not Palindrome String ");}

	}

}
