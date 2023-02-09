package star_Patterns;

public class F13_AscDesc_IncreasingDescreasing {

	public static void main(String[] args) {
		
			//*
			//**
			//***
			//****
			//***
			//**
			//*
		
			int star = 1;
			
			for(int i=1;i<=7;i++)
			{
				for(int j=1;j<=star;j++) {System.out.print("*");}
				
				if(i<=3) {star++;}
				else {star--;}
				System.out.println();
			}
			
	}

}
