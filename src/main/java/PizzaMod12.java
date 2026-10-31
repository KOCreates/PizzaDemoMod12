//Pizza Class at end of Module 12
// We added a static method named QuickOrder. 


import model.MenuItem;

public class PizzaMod12 extends MenuItem {

	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;  
	 
	public PizzaMod12(String topping, String size, double price) {
		
		this.topping = topping;
		setSize(size);  // replaced this.size = size;
		this.price = price;
		nextOrderNumber++;
		orderNumber = nextOrderNumber;
		
		//We added an exception to be thrown if a field was null
		if (this.size == null) { 
			throw new IllegalArgumentException ("Object not created.");
		}
	}
	
	// Getters and Setters
	public String getTopping() {
		return topping;
	}

	public String getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	// input validation added here for the size of the pizza 
	public void setSize(String size) {
		size= size.toLowerCase();
		if (size.equals("small") || size.equals("large") || 
				size.equals("medium") || size.equals("extra large")) {
			this.size = size; }
		else {
			this.size = null;
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//This is a static method. It is called with the name of the class from your Driver program
	public static PizzaMod12 quickOrder(String topping){

		PizzaMod12 p = new PizzaMod12(topping, "large", 9.99);

		return p;

		}
	
	// other methods
	//In Module 12 we show the super class method getDescription() being called. 
	// Because Pizza extends MenuItem we have access to the getDescription method. 
	// we use super. because it is a method within the superclass.
	//
	public String repeatOrder() {
		String result = super.getDescription(); // calls superclass getDescription() 
 		result += "Order number: " + orderNumber;
		result += ", Topping: " + topping;
		result += ", Size: " + size;
		result += ", Price: $" + price;
		return result;
	}
	
	//toString methods provides a way to display the objects instance fields using
	// System.out.println.  This is an overridden method. 
 
	public String toString() {
		String result ="";
		result += super.getDescription();
		result += "\nPizza: " + topping;
		result += "\nSize: " + size;
		result += "\nPrice: " + price;
		return result;
	}

}

