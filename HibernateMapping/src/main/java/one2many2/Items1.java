package one2many2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="jbdl42-12M-Item1")
public class Items1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "itemId")
	private String itemId;
	@Column(name = "itemTotal")
	private int itemTotal;
	@Column(name = "quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name ="cart_id", nullable = false)
	private Cart1 cart1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public Items1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items1(String itemId, int itemTotal, int quantity, Cart1 cart1) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart1 = cart1;
	}
	@Override
	public String toString() {
		return "Items1 [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity
				+ ", cart1=" + cart1 + "]";
	}
	
	
}
