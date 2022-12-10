
public class PrintThread extends Thread{
	
	String name;
	HelloWorld hello;
	
	
	
	public PrintThread(String name, HelloWorld hello) {
		super();
		this.name = name;
		this.hello = hello;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (hello) {
			hello.print();
		}
		
	}

}
