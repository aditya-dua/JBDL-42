package files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileMain {
	public static void main(String[] args) throws IOException {
		
//		File obj = new File("myFile.txt");
//		
//		
//		if(obj.exists()) {
//			System.out.println("Yes, File Exists!");
//		}else {
//			obj.createNewFile();
//			
//			System.out.println("File Creation Success!");
//		}
//		
//		System.out.println("File Name is:"+obj.getName());
//		System.out.println("File Length is:"+obj.length());
//		System.out.println("File isDirectory:"+obj.isDirectory());
//		
//		File file = new File("test");
//		System.out.println("File isDirectory:"+file.isDirectory());
//		
		
//		File file = new File("abc/def");
//		System.out.println("File "+file.getAbsolutePath());
//		System.out.println("File "+file.getCanonicalPath());
//		file.list();
//		if(file.mkdirs()) {
//			System.out.println("All folders have been created!");
//		}else {
//			System.out.println("All folders have been not created!");
//		}
//		
//		File abFile = new File(file.getAbsoluteFile()+"/myFile.txt");
//		if(abFile.createNewFile()) {
//			System.out.println("File Creation Success!");
//		}
		

		File file = new File("/");
		String[] fileList = file.list();
		
		for (int i = 0; i < fileList.length; i++) {
			System.out.println("File: "+fileList[i]);
		}
		
		/*
		 * if (obj.delete()) { System.out.println("File Deletion Success!"); }
		 */
		

	}
}
