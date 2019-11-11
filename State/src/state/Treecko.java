package state;

public class Treecko extends State {
	
	private static State state;
	private String pokemon;
	
	private Treecko() {
		pokemon = "Treecko";
	}
	@Override
	public void basicAttack(Pokemon p) {
		System.out.println(pokemon + " used Tail Whip");
	}
	@Override
	public void specialAttack(Pokemon p) {
		System.out.println(pokemon + " used Razor Leaf");
	}
	@Override
	public void evolve(Pokemon p) {
		System.out.println(pokemon + " is evolving...\n");
		changeState(p, Grovyle.getInstance());
	}
	@Override
	public void getEvolution(Pokemon p) {
		System.out.println("You have a Pokemon called " + pokemon);
	}
	public static synchronized State getInstance() {
		if (state == null) {
			state = new Treecko();
		}
		return state;
	}

}
