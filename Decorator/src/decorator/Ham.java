package decorator;

public class Ham extends PizzaTopping {
	
	private double price = 1.89;

	public Ham(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", ham";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;
		
	}

}
