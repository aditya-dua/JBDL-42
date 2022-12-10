
public class RunnableExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableExample re = new RunnableExample();
		
		Thread t = new Thread(re,"Thread -1");
		Thread t1 = new Thread(re,"Thread -2");
		t1.setPriority(Thread.MAX_PRIORITY);
		//t1.setDaemon(true);

		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isDaemon());
		System.out.println(t1.isAlive());
		System.out.println(t.getName());
		t.start();
		t1.start();
		
	}

}
