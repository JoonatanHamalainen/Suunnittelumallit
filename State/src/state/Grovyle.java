package state;

public class Grovyle extends State{
	
	private static State state;
	private String pokemon;
	
	private Grovyle() {
		pokemon = "Grovyle";
	}
	@Override
	public void basicAttack(Pokemon p) {
		System.out.println(pokemon + " used Quick Attack");
	}

	@Override
	public void specialAttack(Pokemon p) {
		System.out.println(pokemon + " used Leaf Blade");
	}

	@Override
	public void evolve(Pokemon p) {
		System.out.println(pokemon + " is evolving...\n");
		changeState(p, Sceptile.getInstance());
	}
	@Override
	public void getEvolution(Pokemon p) {
		System.out.println("It evolved into " + pokemon);
	}
	public static synchronized State getInstance() {
		if (state == null) {
			state = new Grovyle();
		}
		return state;
	}
}
