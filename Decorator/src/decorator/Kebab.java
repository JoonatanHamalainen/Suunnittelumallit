package decorator;

public class Kebab extends PizzaTopping {
	
	private double price = 2.76;

	public Kebab(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", kebab";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;
		
	}

}
