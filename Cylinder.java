import java.lang.Math.*;

public class Cylinder {
	private double radius;
	private double height;

	public Cylinder() {
		radius = 1;
		height = 1;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else
			throw new IllegalArgumentException("\nRadius should be +ve!");
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else
			throw new IllegalArgumentException("\nHeight should be +ve!");
	}

	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}

	public String toString() {
		return String.format("\nRadius: %f, Height: %f", getRadius(), getHeight());
	}

	public double volume() {
		double r, h, v;
		r = getRadius();
		h = getHeight();
		v = Math.PI * Math.pow(r, 2) * h;
		return v;
	}

	public void displayVolume() {
		System.out.printf("\nVolume is: %f", volume());
	}
}
