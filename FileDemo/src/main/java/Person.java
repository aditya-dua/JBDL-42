import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private String name;
	private int id;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	
}
