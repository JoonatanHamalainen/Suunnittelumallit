package composite;

public class CPU implements Component {
	
	private double price;
	
	public CPU(double price) {
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
