package string;

public class _3_RemoveSpacialCharacter {

	public static void main(String[] args) {
		String space = "java    selenium manual testong automation testing";
		
		String Sp = "$%#@&$Niranjan16243523";
		
//		^  is used for other than symbol (Caret)
		
		//Remove Special Characters -->
		String NewSp=Sp.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("After Removing Spacial Characters = "+NewSp);
		
		//Remove Numbers -->
		String Name=Sp.replaceAll("[^a-zA-Z]","");
		System.out.println("After Removing Number = "+Name);

	
	
	
	String removespace = space.replace(" ", "");
	System.out.println("may name is Niranjan My skills are \n"+removespace);
	
	
	
	
	
	
	
	
	}

}
