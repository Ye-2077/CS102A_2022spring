
public class Rectangle extends Shape {
	private double width;
	private double height;
	private ShapeColor color = ShapeColor.GRAY;

	public Rectangle(double x, double y) {
		super(x,y);

	}

	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;

	}

	public static int getScreenSize() {
		return Shape.getScreenSize();
	}

	public static void setScreenSize(int screenSize) {
		Shape.setScreenSize(screenSize);
	}

	public void checkColor() {
		if (isInBoundary()) {
			color = ShapeColor.GREEN;
		} else {
			color = ShapeColor.RED;
		}
	}

	public boolean isInBoundary() {
		if (-1 * Shape.getScreenSize() > this.x - this.width / 2 || Shape.getScreenSize() < this.x + this.width / 2) {
			return false;
		}
		if (-1 * Shape.getScreenSize() > this.y - this.height / 2 || Shape.getScreenSize() < this.y + this.height / 2) {
			return false;
		}
		return true;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Rectangle{" +
				"width=" + width +
				", height=" + height + " x=" + x +
				", y=" + y +
				", color=" + color +
				"}\n";
	}

	public void draw() {
		StdDraw.setPenColor(color.getColor());
		StdDraw.filledRectangle(x, y, this.width / 2, this.height / 2);
	}

}
