package star_Patterns;

public class Triangle_Left_Ascending {

	public static void main(String[] args) {

	
		// *
		// **
		// ***
		// ****
		// *****
		
		
		//No of rows = 5 , No of column = 5
		
//		1) Check number of Elements in first row and make ref variable = 1.
		int star=1;  
		
//		2) Write outer for loop for number of rows = 5.
		for(int i=1;i<=5;i++) 
		{   	
//			3) Inner for loop for number of columns = 5.
			for(int j=1;j<=star;j++) {System.out.print("*");}//Use(Print)Command 
															
			System.out.println(); // After completing one inner loop cycle
								  //shift to next line
		
			//4)Update As per our requirement inside for loop
				star++;
		}
		
	}
	}
