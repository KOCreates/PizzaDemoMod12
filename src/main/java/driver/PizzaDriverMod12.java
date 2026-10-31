package driver;//End of Module 12 Version
// Order is a class that holds an ArrayList of Pizzas 
// It is used to demonstrate how objects may be passed 
// The Quickorder static method is also used to show how you can return a pizza item 


import model.Order;
import model.Pizza;

import java.text.DecimalFormat;

public class PizzaDriverMod12 {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String divider = "-".repeat(80);

        // Using another class to organize our orders - this will use composition of classes
        Order familyReunion = new Order();  // creates an Order object.
        Order noCookFriday = new Order();

        double totalBill = 0.0;

        Pizza myPizza = new Pizza("hamburger", "small", 12.99);
        Pizza dadsPizza = new Pizza("meat lovers", "medium", 15.99);
        Pizza petsPizza = new Pizza("Doggie biscuits", "small", 10.99);
        noCookFriday.addToOrder(myPizza);
        noCookFriday.addToOrder(dadsPizza);
        noCookFriday.addToOrder(petsPizza);

        System.out.println(divider);
        System.out.println("Your No Cook Friday Order");
        System.out.println(myPizza.repeatOrder());
        System.out.println(dadsPizza.repeatOrder());
        System.out.println(petsPizza.repeatOrder());

        System.out.println("Amount Due: $" + decimalFormat.format(noCookFriday.getTotalDue()));

        Pizza yourPizza = new Pizza("pineapple", "large", 13.50);
        Pizza partyPizza = new Pizza("Everything", "extra large", 23.99);
        Pizza aPizza = new Pizza("mushroom", "small", 10.56);

        familyReunion.addToOrder(yourPizza);
        familyReunion.addToOrder(partyPizza);
        familyReunion.addToOrder(aPizza);

        totalBill = familyReunion.getTotalDue();

        // Prints individuals pizzas for Family reunion using the printOrder method
        System.out.println(divider);
        System.out.println("Your Family Reunion orders");
        System.out.println(familyReunion.printOrder());
        System.out.println("Total for Family Reunion $" + decimalFormat.format(totalBill));


        // Testing the Static method quickOrder
        // You do not need to create a pizza object to use this method you call it
        // using the class name "Pizza" because it is a static method.
        System.out.println(divider);

        Pizza fastPizza = Pizza.quickOrder("anchovies");
        System.out.println("Fast Pizza ordered " + fastPizza.repeatOrder());


    }
}
