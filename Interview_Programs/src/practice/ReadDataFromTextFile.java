package practice;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("//Users//UM20118901//Desktop//user.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
