import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFileFromURL {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://media.geeksforgeeks.org/wp-content/cdn-uploads/20210420155809/gfg-new-logo.png");
			File f = new File("gfg-logo.png");
			
			FileUtils.copyURLToFile(url, f);
			
			System.out.println("The file size is:"+f.length());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
