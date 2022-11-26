package constructor;

public class ParamConstructor extends Constructor{

	String message;
	
	public ParamConstructor(String message) {
		// TODO Auto-generated constructor stub
		this();
		this.message=message;
		//Constructor call must be the first statement in a constructor
		//this();

		System.out.println("In Param constructor");

	}
	
	public ParamConstructor() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("In Default constructor");
		
	}
	
	public ParamConstructor(int a) {
		// TODO Auto-generated constructor stub
		
		System.out.println("In Int Param constructor");
		
	}
	
}
