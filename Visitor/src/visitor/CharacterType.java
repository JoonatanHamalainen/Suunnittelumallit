package visitor;

public abstract class CharacterType {
	
private State state;
	
	protected void changeState(State state) {
		this.state = state;
	}
	
	public CharacterType() {
		state = Awake.getInstance();
	}
	
	public void levelUp() {
		state.levelUp(this);
}
	
	public abstract int getLevel();
	public abstract int getHPTotal();
	public abstract int getAPTotal();
	public abstract int getDPTotal();
	public abstract int getTimesLeveled();
	
	public abstract double getHPMultiplier();
	public abstract double getAPMultiplier();
	public abstract double getDPMultiplier();
	
	public abstract void setLevel(int lvl);
	public abstract void setHPTotal(int hp);
	public abstract void setAPTotal(int ap);
	public abstract void setDPTotal(int dp);
	public abstract void setTimesLeveled(int times);
}
