
public class HelloWorld {

	public void print() {
		for(int i=0;i<10;i++) {
			System.out.println("HW print Method"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
