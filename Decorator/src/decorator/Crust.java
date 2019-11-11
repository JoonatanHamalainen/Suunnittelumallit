package decorator;

public class Crust extends PizzaTopping{
	
	private double price = 5.5;

	public Crust(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}
	@Override
	public String getDescription() {
		return super.getDescription() + "crust";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;	
	}
}
