package decorator;

public class Main {
	public static void main(String[] args) {
		
		Pizza cheesePizza = new TomatoPaste(new Cheese(new Crust(new PlainPizza())));
		Pizza meatloverPizza = new TomatoPaste(new Ham(new Kebab(new Salami(new Cheese(new Crust(new PlainPizza()))))));
		Pizza salamiPizza = new TomatoPaste(new Salami(new Cheese(new Crust(new PlainPizza()))));
		
		
		System.out.println(cheesePizza.getDescription() + " that costs " + cheesePizza.getTotal() + "€");
		System.out.println(meatloverPizza.getDescription() + " that costs " + meatloverPizza.getTotal() + "€");
		System.out.println(salamiPizza.getDescription() + " that costs " + salamiPizza.getTotal() + "€");
	}

}
