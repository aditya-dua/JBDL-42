package many2many;

import java.util.Set;

public class Items {

	private int id;
	private String itemId;
	private int itemTotal;
	private int quantity;
	private Set<Cart> carts;
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
	
	public Items(String itemId, int itemTotal, int quantity) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		//this.cart = cart;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<Cart> getCarts() {
		return carts;
	}
	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity
				+ ", carts=" + carts + "]";
	}
	
	
	
}
