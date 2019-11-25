package builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder extends BurgerBuilder {
	
	List<String> burger = new ArrayList<>();

	@Override
	public List getBurger() {
		return burger;
	}

	@Override
	public void makeBuns() {
		burger.add("Sampylat");
		
	}

	@Override
	public void makeSauce() {
		burger.add("Majoneesi");
		
	}

	@Override
	public void makeBeef() {
		burger.add("Pihvi");
		
	}

}
