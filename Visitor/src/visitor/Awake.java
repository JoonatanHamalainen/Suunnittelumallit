package visitor;

public class Awake extends State{

	private static State state;
	private int oldlvl;
	private int oldhp;
	private int oldap;
	private int olddp;
	private int dp;
	private int ap;
	private int hp;
	private int lvl;
	
	private Awake() {}
	
	public static synchronized State getInstance() {
		if (state == null) {
			state = new Awake();
		}
		return state;
	}
	
	public void levelUp(CharacterType chr) {
		oldlvl = chr.getLevel();
		oldhp = chr.getHPTotal();
		oldap = chr.getAPTotal();
		olddp = chr.getDPTotal();
		
		hp = oldhp;
		ap = oldap;
		dp = olddp;
		lvl = oldlvl + 1;
		
		for (int i=0; i<lvl; i++) {
			 hp += (int) (100 * chr.getHPMultiplier());
			 ap += (int) (100 * chr.getAPMultiplier());
			 dp += (int) (100 * chr.getDPMultiplier());
		}	
		showStats();
		chr.setTimesLeveled(1);
	}
	
	private void showStats() {
		System.out.println("Character stats are now:" + 
				"\nLevel: " +  oldlvl + "->" + lvl +  
				"\nHealth Points: "  + oldhp + "->" + hp + 
				"\nAttack Power: " + oldap + "->" + ap  + 
				"\nDefence Power: " + olddp + "->" + dp);
	}
}
