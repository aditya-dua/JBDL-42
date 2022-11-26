package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c = new Constructor();	
		c.message="Test Message";
		System.out.println(c.message);
		
		ParamConstructor pc = new ParamConstructor("Hello World!");
		System.out.println(pc.message);
		
		// Once you define any constructor in the class, java doesnot provides you with the dfeault constructor.
		ParamConstructor pc1 = new ParamConstructor();
		pc1.message="Test Message";
		System.out.println(pc1.message);
	}
	
	public void main (String main) {}

}
