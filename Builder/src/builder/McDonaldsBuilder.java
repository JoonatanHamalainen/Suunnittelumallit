package builder;

public class McDonaldsBuilder extends BurgerBuilder {
	
	StringBuilder burger = new StringBuilder();

	@Override
	public Object getBurger() {
		return burger;
	}

	@Override
	public void makeBuns() {
		burger.append("Buns, ");
		
	}

	@Override
	public void makeSauce() {
		burger.append("Sauce, ");
		
	}

	@Override
	public void makeBeef() {
		burger.append("Beef Patty");
		
	}

}
