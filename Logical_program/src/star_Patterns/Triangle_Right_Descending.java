package star_Patterns;

public class Triangle_Right_Descending {

	public static void main(String[] args) {

		// *****
		//  ****
		//   ***
		//    **
		//     *
		
//		No of rows = 5 , No of columns = 5

	//1) Check number of Elements in first row and make ref variable =2.
		int space=0; // ---- Whenever there is space use first space for loop
		int star=5; 
		
		
	//2) create outer for loop for rows
		for(int i=1;i<=5;i++) 
			
		{ 	//3)create inner for loop for space columns=5
			for(int j=1;j<=space;j++) {System.out.print(" ");}
			
			//3.1)create inner for loop for star columns=5
			for(int j=1;j<=star;j++) {System.out.print("*");}
			
			System.out.println();
			//4)Update As per our requirement inside for loop
			star--;
			space++;
		}
	
		
		
		
		
	}

}
