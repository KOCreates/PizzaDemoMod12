package driver;//End of Module 12 Version
// Order is a class that holds an ArrayList of Pizzas 
// It is used to demonstrate how objects may be passed 
// The Quickorder static method is also used to show how you can return a pizza item 


import model.Order;
import model.Pizza;

import java.text.DecimalFormat;

public class PizzaDriver_Interface {

	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");

		// Using another class to organize our orders - this will use composition of classes 
		Order familyReunion = new Order();  // creates an Order object.
		double totalBill = 0.0;

		Pizza yourPizza = new Pizza("pineapple", "large", 13.50);
		Pizza partyPizza = new Pizza("Everything", "extra large", 23.99);
		Pizza aPizza = new Pizza("mushroom", "small", 10.56);
		// Testing the Static method quickOrder 
		// You do not need to create a pizza object to use this method you call it 
		// using the class name "Pizza" because it is a static method. 
		Pizza fastDelivery = Pizza.quickOrder ("Pepperoni");
		
		
		familyReunion.addToOrder(yourPizza);
		familyReunion.addToOrder(partyPizza);
		familyReunion.addToOrder(aPizza);
		familyReunion.addToOrder(fastDelivery);
		
		totalBill = familyReunion.getTotalDue();
		System.out.println("Total for Family Reunion $"+decimalFormat.format(totalBill));
		
//		// Prints individuals pizzas 
		System.out.println("Your orders");
 		System.out.println(yourPizza.repeatOrder());
		System.out.println(partyPizza.repeatOrder());
		System.out.println(aPizza.repeatOrder());
		System.out.println(fastDelivery.repeatOrder());

		// Interface testing
		System.out.println("Testing the Interface");
		System.out.println("Temperature: " + yourPizza.getOvenTemperature());
		System.out.println(yourPizza.prepareIngredients());
		System.out.println("Ready for the Oven: " + yourPizza.readyForOver());
		

	}
}
