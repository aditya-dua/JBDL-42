package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("myFirstTextFile.txt");
			System.out.println("The file size is:"+f.length());
			Scanner reader = new Scanner(f);
			
			String data;
			
			while(reader.hasNextLine()) {
				data = reader.nextLine();
				System.out.println(data);
			}
			
			reader.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
