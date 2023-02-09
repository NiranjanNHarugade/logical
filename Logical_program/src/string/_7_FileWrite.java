package string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _7_FileWrite {

	public static void main(String[] args) throws IOException {
	
		
		// Write Text File
		FileWriter Fw = new FileWriter("G:\\Niranjan-Testing\\selinium\\xcel\\Sample 2.Txt");
		BufferedWriter Bw= new BufferedWriter(Fw);
		Bw.newLine();
		Bw.write("My Name is Niranjan");
		Bw.newLine();
		Bw.write("Automation With Selenium Java");
		Bw.close();
		System.out.println("Success");
		
		

	}

}
