package inter.thread.communication;

public class Chat {

	boolean flag = false;
	
	
	public synchronized void question(String msg) {
	      if (flag) {
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	      System.out.println(msg);
	      flag = true;
	      notify();
	   }
	
	public synchronized void answer(String msg) {
	      if (!flag) {
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }

	      System.out.println(msg);
	      flag = false;
	      notify();
	   }
}
