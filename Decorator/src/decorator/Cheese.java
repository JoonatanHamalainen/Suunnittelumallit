package decorator;

public class Cheese extends PizzaTopping {
	
	private double price = 0.66;

	public Cheese(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}
	@Override
	public String getDescription() {
		return super.getDescription() + ", cheese";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;
		
	}

}
