package star_Patterns;

public class E15_Diamond_pattern {

	public static void main(String[] args) {
		
//					*
//				   ***
//				  *****
//				 *******
//				  *****
//				   ***
//				    *
		
		int star=1;
		int space=3;
		
		for(int i=1;i<=7;i++) 
		{
			for(int j=1;j<=space;j++) {System.out.print(" ");}
			for(int j=1;j<=star;j++) {System.out.print("*");}
			
			if(i<=3) {star=star+2;  space--;}
			else {star=star-2; space++;}
			
			
			System.out.println();
			
			
		}
	}

}
