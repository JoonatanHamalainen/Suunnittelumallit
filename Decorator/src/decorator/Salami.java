package decorator;

public class Salami extends PizzaTopping{
	
	private double price = 2.1;

	public Salami(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}
	@Override
	public String getDescription() {
		return super.getDescription() + ", salami";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;
		
	}

}
