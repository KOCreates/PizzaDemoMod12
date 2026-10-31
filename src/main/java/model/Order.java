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

    public String printOrder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Order\n");

        for (Pizza p : customerOrderList) {
            sb.append(p.repeatOrder() + "\n");
        }
            return sb.toString();
    }
}
