import java.lang.*;
import java.util.Scanner;

public class tcs_ClockAngle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int period, t, h, m;
		float longitude, time, angle;
		period = in.nextInt();
		longitude = in.nextFloat();
		time = period * longitude / 360;
		if (time > 12) {
			time -= 12;
		}
		System.out.println(time);
		t = (int) (time * 60);
		h = t / 60;
		m = t - h * 60;
		System.out.println(h);
		System.out.println(m);
		angle = (60 * h - 11 * m) / 2;
		if (angle < 0) {
			angle *= (-1);
		} else if (angle > 180 && angle <= 360) {
			angle = 360 - angle;
		} else if (angle > 360) {
			angle -= 360;
		}
		System.out.printf("%.2f", angle);
		// TODO Auto-generated method stub
	}
}