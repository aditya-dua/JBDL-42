
public class PrintThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld hw = new HelloWorld();
		PrintThread pt = new PrintThread("PT", hw);

	
		PrintThread pt1 = new PrintThread("PT", hw);
		pt.start();
		
		pt1.start();
	}

}
