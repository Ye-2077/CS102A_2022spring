import javafx.scene.LightBase;

public class Circle extends Shape {
    private double radius;
    static final int DEFAULT_RADIUS = 5;



    public Circle(double radius, double x, double y) {
        super(x,y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;
    }

    public Circle(double x, double y) {
        super(x,y);
        this.radius = DEFAULT_RADIUS;
    }

    public static int getScreenSize() {
        return Shape.getScreenSize();
    }

    public static void setScreenSize(int screenSize) {
        Shape.setScreenSize(screenSize);
    }

    public void checkColor() {
        if (isInBoundary()) {
            super.setColor(ShapeColor.GREEN);
        } else {
            super.setColor(ShapeColor.RED);
        }
    }

    public boolean isInBoundary() {
        if (-1 * Shape.getScreenSize() > x - this.radius || Shape.getScreenSize() < x + this.radius) {
            return false;
        }
        if (-1 * Shape.getScreenSize() > y - this.radius || Shape.getScreenSize() < y + this.radius) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + " x=" + x +
                ", y=" + y +
                ", color=" + super.getColor() +
                "}\n";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) { this.setX(x); }

    public double getY() { return y; }

    public void setY(double y) {
        this.setY(y);
    }

    public void draw() {

        StdDraw.setPenColor(getColor().getColor());
        StdDraw.filledCircle(x, y, radius);

    }
}
