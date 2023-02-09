package string;

public class _1_Reverse_String {

	public static void main(String[] args) {
	
		
		String Word="Hello";				
		String Rev="";
		
		for(int i=Word.length()-1;i>=0;i--)
		{
			Rev=Rev+Word.charAt(i);
		}
			
		
		System.out.println("Reverse String = "+Rev);

	}

}
