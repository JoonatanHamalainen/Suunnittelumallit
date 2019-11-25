package builder;

public class Main {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		BurgerBuilder hese = new HesburgerBuilder();
		waiter.setup(hese);
		Object burger = waiter.makeBurger();
		System.out.println(burger);
		
		BurgerBuilder mcD = new McDonaldsBuilder();
		waiter.setup(mcD);
		burger = waiter.makeBurger();
		System.out.println(burger);
	}
}
