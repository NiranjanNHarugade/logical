package star_Patterns;

public class E12_DescAsc_DecreasingIncreasing {

	public static void main(String[] args) {

		
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		int star=5;
		
		
		for(int i=1;i<=9;i++)
		{
			
			for(int j=1;j<=star;j++) {System.out.print("*");}
			
			if (i<=4) {star--;   }
			else {star++; }
			System.out.println();
		}
	}

}
