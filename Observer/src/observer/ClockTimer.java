package observer;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class ClockTimer extends Observable {
	
	private int hour, minute, second;
	
	public int getHour() {
		return hour;

	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void tick() {
		
		if (second == 59 && minute == 59) {
			hour++;
			second = 0;
			minute = 0;
		}
		else if (second == 59) {
			minute++;
			second = 0;
		}
		else {
			second++;
		}
		setChanged();
		notifyObservers();
	}

	public void start() {
		while(true) {
				try {
					TimeUnit.SECONDS.sleep(1);
					tick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
	}

}
