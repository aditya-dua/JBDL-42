
public class RunnableExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableExample re = new RunnableExample();
		
		Thread t = new Thread(re);
		Thread t1 = new Thread(re);
		t.start();
		t1.start();
		
	}

}
