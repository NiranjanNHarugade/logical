package array_example;

public class _6_SearchElement {

	public static void main(String[] args) {

		String ar[]= {"Niranjan","Akshay","Sourabh","Kiran"};
		String Find="Sourabh";   
		
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]==Find) {System.out.println("Location of "+Find+" Is = "+(i+1));}
		}
		
	}

}
