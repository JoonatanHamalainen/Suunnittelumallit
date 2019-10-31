package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer timer) {
		this.timer = timer;
		timer.addObserver(this);
		timer.start();
	}

	@Override
	public void update(Observable o, Object arg) {
		ClockTimer timer = (ClockTimer) o;
		if ((ClockTimer) o == timer) {
			draw();
		}
		 
	}
	private void draw() {
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();
		String time = (hour + ":" + minute + ":" + second);
		System.out.println(time);
	}

}
