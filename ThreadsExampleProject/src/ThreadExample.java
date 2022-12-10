
public class ThreadExample extends Thread{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<100;i++) {
			System.out.println("ThreadExample"+this.getName()+" "+i);
		}
		
	}
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		
		ThreadExample t2 = new ThreadExample();
		
		Thread thread1 = new Thread(t1);
		
		
		thread1.start();
		t1.start();
		t2.start();
	}
}
