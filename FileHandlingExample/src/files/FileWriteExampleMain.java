package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("myFirstTextFile.txt");
			FileWriter file = new FileWriter(f);
			
			file.write("Its my First File with data");
			file.flush();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
