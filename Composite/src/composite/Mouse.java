package composite;

public class Mouse implements Component {
	
	private double price;
	
	public Mouse(double price) {
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
