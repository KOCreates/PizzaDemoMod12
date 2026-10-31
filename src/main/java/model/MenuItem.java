package model;

public class MenuItem {
	
	private String description;
	
	public MenuItem(){
		//setDescription("Pizza - a dish of Italian origin consisting of a flat, \nround base of dough baked with a topping of tomato sauce and cheese, \ntypically with added meat or vegetables.\n");
		setDescription("Pizza:");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
