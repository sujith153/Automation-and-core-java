package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("./file.txt");
		file.createNewFile();
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine())
			System.out.println(scan.nextLine());
		scan.close();
		
	}

}
