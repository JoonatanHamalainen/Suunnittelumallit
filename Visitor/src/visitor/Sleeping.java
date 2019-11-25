package visitor;

public class Sleeping extends State {
	
	private static State state;
	
	public static synchronized State getInstance() {
		if (state == null) {
			state = new Sleeping();
		}
		return state;
	}

	@Override
	public void levelUp(CharacterType chr) {
		System.out.println("Character is sleepping so it can't level up!");
	}
}
