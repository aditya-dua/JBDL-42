package inherintance.multilevel;

public class TraineeEmployee extends Employee{

	int tenure;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Trainee Display Called::"+toString());
	}

	@Override
	public String toString() {
		return "TraineeEmployee [tenure=" + tenure + ", salary=" + salary + ", designation=" + designation + ", id="
				+ id + ", name=" + name + "]";
	}
	
	
}
