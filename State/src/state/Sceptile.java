package state;

public class Sceptile extends State{
	
	private static State state;
	private String pokemon;
	
	private Sceptile() {
		pokemon = "Sceptile";
	}
	@Override
	public void basicAttack(Pokemon p) {
		System.out.println(pokemon + " used X-Scissor");
	}
	@Override
	public void specialAttack(Pokemon p) {
		System.out.println(pokemon + " used Leaf Storm");
	}
	@Override
	public void getEvolution(Pokemon p) {
		System.out.println("It evolved into " + pokemon);
	}
	public static synchronized State getInstance() {
		if (state == null) {
			state = new Sceptile();
		}
		return state;
	}

}
