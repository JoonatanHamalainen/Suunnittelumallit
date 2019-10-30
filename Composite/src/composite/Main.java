package composite;

public class Main {
	
	public static void main(String[] args) {
		
		Component allComponentsInSetup = new Setup();
		
		Component monitor = new Monitor(356.56);
		
		allComponentsInSetup.addToSetup(monitor);
		
		Component mouse = new Mouse(10.65);
		
		allComponentsInSetup.addToSetup(mouse);
		
		Component keyboard = new Keyboard(56.82);
		
		allComponentsInSetup.addToSetup(keyboard);
		
		Component ccase = new Case();
		
		allComponentsInSetup.addToSetup(ccase);
		
		System.out.println("Setup costs: " + allComponentsInSetup.getPrice() + " €");
	}
}
