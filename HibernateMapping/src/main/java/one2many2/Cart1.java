package one2many2;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="jbdl42-12M-Cart1")
public class Cart1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "total")
	private int total;
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "cart1")
	private Set<Items1> items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Set<Items1> getItems() {
		return items;
	}
	public void setItems(Set<Items1> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart1 [id=" + id + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}
	
	
	
	public Cart1(int id, int total, String name) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
		//this.items = items;
	}
	public Cart1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
