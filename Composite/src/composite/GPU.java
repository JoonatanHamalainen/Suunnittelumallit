package composite;

public class GPU implements Component {
	
	private double price;
	
	public GPU(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void addToSetup(Component component) {
		// TODO Auto-generated method stub
		
	}

}
