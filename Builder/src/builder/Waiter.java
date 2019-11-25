package builder;

public class Waiter {

	BurgerBuilder builder;

	public void setup(BurgerBuilder builder) {
		this.builder = builder;
	}

	public Object makeBurger() {
		builder.makeBuns();
		builder.makeSauce();
		builder.makeBeef();
		return builder.getBurger();
	}
}
