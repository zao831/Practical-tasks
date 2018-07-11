package other;

/**
 * Task: Calculate the angle between the hour and minute hands of the clock
 * 
 * @author Anton Baker
 * @date Wednesday, 2018-07-11
 */

public class AngleHoursMinutesDemo {

	public static void main(String[] args) {

		AngleHoursMinutes demo = new AngleHoursMinutes();

		System.out.println(demo.angleCalc2(0, 30));
		System.out.println(demo.angleCalc2(1, 30));
		System.out.println(demo.angleCalc2(13, 30));

	}
}