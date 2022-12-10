package inter.thread.communication;

public class ITCMain {

	public static void main(String[] args) {
		
		
		Chat chat = new Chat();
		

		T1 t1 = new T1(chat);
		T2 t2 = new T2(chat);
	}
}
