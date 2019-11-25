package visitor;

public abstract class State {

	protected void changeState(CharacterType chr, State state) {
		chr.changeState(state);
	}
	
	public abstract void levelUp(CharacterType chr);
}
