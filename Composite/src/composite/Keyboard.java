package composite;

public class Keyboard implements Component {
	
	private double price;
	
	public Keyboard(double price) {
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
