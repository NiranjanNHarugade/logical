package star_Patterns;

public class E14_ButterFly {

	public static void main(String[] args) {
		//*        *
		//**      **
		//***    ***
		//****  ****
		//**********
		//****  ****
		//***    ***
		//**      **
		//*        *
		
		int star=1;
		int space=8;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++) {System.out.print("*");}
			for(int j=1;j<=space;j++) {System.out.print(" ");}
			for(int j=1;j<=star;j++) {System.out.print("*");}
			
			
		if(i<=4) {star++;  space=space-2; }
		else {star--; space=space+2;}
		
			System.out.println();
		
		}
		
	}

}
