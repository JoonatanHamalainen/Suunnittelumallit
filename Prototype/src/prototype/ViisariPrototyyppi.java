package prototype;

import java.util.Calendar;

public class ViisariPrototyyppi implements Cloneable {
	
	Calendar aika = Calendar.getInstance();
	
	private int tunti = aika.get(Calendar.HOUR_OF_DAY) * 5;
	private int minuutti = aika.get(Calendar.MINUTE);
	private int sekunti = aika.get(Calendar.SECOND);
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSekunti() {
		return sekunti;
	}
	
	public int getMinuutti() {
		return minuutti;
	}
	
	public int getTunti() {
		return tunti;
	}
	
	public void setup(int aikaTyyppi, int viisarinPituus) {
		if (tunti > 12) { 
			tunti -= 12; 
		}
		double angle = Math.toRadians((15 - aikaTyyppi)*6);
		x = (int)(Math.cos(angle) * viisarinPituus);
		y = (int)(Math.sin(angle) * viisarinPituus);
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
