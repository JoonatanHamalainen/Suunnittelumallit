package decorator;

public abstract class PizzaTopping implements Pizza {
	
	protected Pizza pizzaToBeTopped;
	
	public PizzaTopping(Pizza pizzaToBeTopped) {
		this.pizzaToBeTopped = pizzaToBeTopped;
	}
	@Override
	public String getDescription() {
		return pizzaToBeTopped.getDescription();
	}
	@Override
	public double getTotal() {
		return pizzaToBeTopped.getTotal();
	}
}
