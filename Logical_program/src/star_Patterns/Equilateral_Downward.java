package star_Patterns;

public class Equilateral_Downward {

	public static void main(String[] args) {
		//  *******
		//   *****
		//    ***
		//     *
		
		
		int space=0;
		int star=7;
		
		for(int i=1;i<=7;i++)
		{	for(int j=1;j<=space;j++) {System.out.print(" ");}
			for (int j=1;j<=star;j++){System.out.print("*");}
			
			
			
			star=star-2;
			space++;
			System.out.println();
		
		}
		
		
		
		
		
	}

}
