public class Circle {
	final double PI = 3.14169;

	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}

	public Circle(double r) {
		this.radius = r;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return PI * this.radius * this.radius;
	}

	public double getDiameter() {
		return this.radius * 2;
	}

	public double getCircumference() {
		return this.radius * 2 * PI;
	}
}
