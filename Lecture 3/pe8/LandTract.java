public class LandTract {
	private double length;
	private double width;

	public LandTract(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		LandTract other = (LandTract) obj;

		return this.length == other.getLength() && this.width == other.getWidth();
	}

	@Override
	public String toString() {
		return "LandTract(lenght:" + this.length + ", width:" + this.width + ", area:" + this.getArea() + ")";
	}
}
