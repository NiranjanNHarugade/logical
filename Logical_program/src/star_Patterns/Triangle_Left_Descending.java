package star_Patterns;

public class Triangle_Left_Descending {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		
		//No of rows = 5 , No of column = 5
		
	//1) Check number of Elements in first row and make ref variable = 1.
		
		int star=5;
		
	//2) create outer for loop for rows
		
		for(int i =1;i<=5;i++) 
		{
			//3)create inner for loop for columns=5
			for(int j=1;j<=star;j++) {
				System.out.print("*");}
			
			
			//4)Update As per our requirement inside for loop
			star--;
			System.out.println();
			
		}

		
		
		
		
		
		
	}

}
