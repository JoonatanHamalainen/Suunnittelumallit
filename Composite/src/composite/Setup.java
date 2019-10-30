package composite;

import java.util.ArrayList;
import java.util.List;

public class Setup implements Component {
	
	List<Component> componentList = new ArrayList<Component>();
	
	public void addToSetup(Component componentToAddToCurrentSetup) {
		componentList.add(componentToAddToCurrentSetup);
	}

	@Override
	public double getPrice() {
		double price = 0;
		for (Component c: componentList) {
			price += c.getPrice();
		}
		return price;
	}

	

}
