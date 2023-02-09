package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _6_File_ReadWrite {

	public static void main(String[] args) throws IOException {
		
		// Read Text File
		FileReader Fr = new FileReader("G:\\Niranjan-Testing\\selinium\\xcel\\Sample.Txt");
		BufferedReader Br= new BufferedReader(Fr);
		
		
		String str ;
		while((str=Br.readLine() )!= null) {System.out.println(str);}
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
	
		
		

	
	}

}
