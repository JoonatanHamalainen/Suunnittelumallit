package composite;

public class Case implements Component {
	
	private double price;
	
	Component[] ccase = {new Memory(125.46), new PSU(90.20), new Motherboard()};

	@Override
	public double getPrice() {
		for (Component c : ccase) {
			price += c.getPrice();
		}
		return price;
	}

	@Override
	public void addToSetup(Component component) {
		// TODO Auto-generated method stub
		
	}

}
