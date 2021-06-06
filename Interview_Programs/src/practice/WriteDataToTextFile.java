package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("//Users//UM20118901//Desktop//user.txt");
		BufferedWriter bw=new BufferedWriter(file);
		bw.write("Hello Selenium");
		bw.newLine();
		bw.write("Hello Selenium");
		bw.newLine();
		bw.write("Hello Selenium");		
		bw.close();
		
		System.out.println("Finished");
	}

}
