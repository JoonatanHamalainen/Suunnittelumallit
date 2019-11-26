package visitor;

public class Marksman extends CharacterType {
	
	private final double hp = 0.3, ap = 0.6, dp = 0.1;
	private int hpTotal = 33, apTotal = 60, dpTotal = 10;
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
