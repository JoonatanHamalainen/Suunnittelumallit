package state;

public class Pokemon {
	private State state;
	
	protected void changeState(State state) {
		this.state = state;
	}
	public Pokemon() {
		state = Treecko.getInstance();
	}
	public void basicAttack() {
		state.basicAttack(this);
	}
	public void specialAttack() {
		state.specialAttack(this);
	}
	public void evolve() {
		state.evolve(this);
	}
	public void getEvolution() {
		state.getEvolution(this);
	}
	
}
