package visitor;

public class Fighter extends CharacterType{

	private final double hp = 0.33, ap = 0.33, dp = 0.34;
	private int hpTotal = 33, apTotal = 33, dpTotal = 34;
	private int lvl = 1, timesLeveled = 0;
	
	@Override
	public int getLevel() {
		return lvl;
	}
	@Override
	public int getHPTotal() {
		return hpTotal;
	}
	@Override
	public int getAPTotal() {
		return apTotal;
	}
	@Override
	public int getDPTotal() {
		return dpTotal;
	}
	@Override
	public double getHPMultiplier() {
		return hp;
	}
	@Override
	public double getAPMultiplier() {
		return ap;
	}
	@Override
	public double getDPMultiplier() {
		return dp;
	}
	@Override
	public void setLevel(int lvl) {
		this.lvl = lvl;
	}
	@Override
	public void setHPTotal(int hp) {
		this.hpTotal = hp;
		
	}
	@Override
	public void setAPTotal(int ap) {
		this.apTotal = ap;
		
	}
	@Override
	public void setDPTotal(int dp) {
		this.dpTotal = dp;
		
	}
	@Override
	public int getTimesLeveled() {
		// TODO Auto-generated method stub
		return timesLeveled;
	}
	@Override
	public void setTimesLeveled(int times) {
		this.timesLeveled = times;
		
	}
}
