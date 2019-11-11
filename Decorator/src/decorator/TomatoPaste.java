package decorator;

public class TomatoPaste extends PizzaTopping{
	
	private double price = 0.5;

	public TomatoPaste(Pizza pizzaToBeTopped) {
		super(pizzaToBeTopped);
	}
	@Override
	public String getDescription() {
		return super.getDescription() + " and tomato paste";
	}
	@Override
	public double getTotal() {
		return super.getTotal() + price;
		
	}

}
