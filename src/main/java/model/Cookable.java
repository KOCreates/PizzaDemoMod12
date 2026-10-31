package model;
/*
 * Karen O'Louglin
 * Nov 13, 2023
 *
 * all interface members are public by default
 * Your IDE may give you a warning that public modifier is not needed, but I like to keep it.
 */

public interface Cookable {
	public double getOvenTemperature();
	public String prepareIngredients();
	public boolean readyForOver();

}
