package composite;

public class PSU implements Component {
	
	private double price;
	
	public PSU(double price) {
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
