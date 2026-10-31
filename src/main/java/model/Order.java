package model;

import java.util.ArrayList;
 
public class Order {

	private double orderTotal;
	private ArrayList<Pizza> customerOrderList;
	
	public Order(){
		System.out.println("A new order is created");
		customerOrderList = new ArrayList<Pizza>();
	}
	
	public double getTotalDue() {
		return orderTotal;
	}
	
	public void addToOrder(Pizza p) {
		customerOrderList.add(p);
		orderTotal += p.getPrice();
	}
}
