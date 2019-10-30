package composite;

public class Motherboard implements Component {
	
	private double price;
	
	Component[] motherboard = {new CPU(108.97), new GPU(87.63), new RAM(32.13)};

	@Override
	public double getPrice() {
		for (Component c : motherboard) {
			price += c.getPrice();
		}
		return price;
	}

	@Override
	public void addToSetup(Component component) {
		// TODO Auto-generated method stub
		
	}

}
