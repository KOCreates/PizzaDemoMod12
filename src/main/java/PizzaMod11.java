//End of Module 11 Version

public class PizzaMod11 {

	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;   
	//Static instance field, created once, most often used to count occurrences of objects 

	// Constructors  - we delete the default constructor to prevent object creation
	// This is a type of input validation. If all components are provided
	// sometimes the object should not be created.

	
	// we must use the setSize(size) method to set the size field since
	// we added some input validation to the sestSize() method 
	public PizzaMod11(String topping, String size, double price) {
		
		this.topping = topping;
		setSize(size);  // replaced this.size = size
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

	// other methods
	public String repeatOrder() {

		String result = "";
		result = "Order number: " + orderNumber;
		result += ", Topping: " + topping;
		result += ", Size: " + size;
		result += ", Price: $" + price;
		return result;
	}
	
	//toString methods provides a way to display the objects instance fields using
	// System.out.println.  This is an overridden method. 
 
	public String toString() {
		String result ="";
		result += "\nPizza: " + topping;
		result += "\nSize: " + size;
		result += "\nPrice: " + price;
		return result;
	}

}

