package string;

public class _5_Reverse_Sentence {
	
	static String Sentance="Hello My Name is Niranjan";				
	static String Rev="";
	
	public static void main(String []args)
	{
		Reverse_Sentance();
		Rev_EachWord();
		
	
	
	}
	


	
	
	public static void Reverse_Sentance()
	{
		for(int i=Sentance.length()-1;i>=0;i--)
		{
			Rev=Rev+Sentance.charAt(i);
		}
	
		System.out.println("Reverse Sentance = "+Rev);
		System.out.println("===========================================");

	}
	
	
	
	public static void Rev_EachWord()
	{
		String word []=Sentance.split(" ");
		
		for (int i=0;i<word.length;i++)
		{
			for(int j=word[i].length()-1;j>=0;j--)    // Take Words from array and Reverse
			{
				System.out.print(word[i].charAt(j));
			}
			System.out.print(" ");
		}	
		
		System.out.println("\n===========================================");
	}
	
	
	
	
	
	
	}

