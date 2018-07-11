package other;

/**
 * Task: Calculate the angle between the hour and minute hands of the clock
 * Executable AngleHoursMinutesDemo.java
 * 
 * @author Anton Baker
 * @date Wednesday, 2018-07-11
 */

public class AngleHoursMinutes {

	public double angleCalc2(int hours, int minutes) {

		if (hours > 12) {
			hours = hours - 12;
		}
		
		double angle = (hours * 5 - minutes) * 6;

		if (angle < 0) {
			angle = angle * -1;
		}
		
		System.out.print("The angle between the " + (hours + 12) + " hour and " + minutes +" minute is: ");
		
		return angle;
	}
}