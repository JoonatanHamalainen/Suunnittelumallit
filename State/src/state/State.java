package state;

public abstract class State {
	
	protected void changeState(Pokemon p, State state) {
		p.changeState(state);
	}
	public void basicAttack(Pokemon p) {}
	public void specialAttack(Pokemon p) {}
	public void evolve(Pokemon p) {}
	public void getEvolution(Pokemon p) {
	}
	
	

}
