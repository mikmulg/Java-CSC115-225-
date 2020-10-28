
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
//import java.util.Timer;
//import java.util.TimerTask;

	
public class ClockUpdate{
		
	private long startTime = 0;
	long totalTime = 0;
	private float seconds;
	private String upClock;

	public void start(){
			
		startTime = System.currentTimeMillis();
	}
	
	public String update(long time) {
		
		seconds = time/1000;
		upClock = String.format("%01d", seconds);
		return upClock;
	}
		
	public void stop(){
		
		totalTime = (long)(System.currentTimeMillis() - startTime);
		update(totalTime);
	}
		
	public void reset(){
		
		update(startTime);
	}
}