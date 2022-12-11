package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileByteStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			File f = new File("my-contacts.txt");
			String contactStr;
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			System.out.println("Current Pointer ::"+raf.getFilePointer());

			if(raf.getFilePointer()<raf.length()) {
				contactStr = raf.readLine();
				System.out.println("Line Read::"+contactStr);
			}
			
			raf.writeBytes("Aditya!1234567890\n");
			
			System.out.println("Data Written to the file.");
			
			raf.writeBytes(System.lineSeparator());
			raf.writeBytes("Aditya!0987654321\n");
			
			System.out.println("Current Pointer ::"+raf.getFilePointer());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
