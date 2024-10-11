package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("./file.txt/"));
		int ascicode;
		String text = "";
		
		while((ascicode = fr.read()) != -1) {
			text +=  String.valueOf((char)ascicode);
		}
		
		System.out.println(text);
		fr.close();
		
	}

}
