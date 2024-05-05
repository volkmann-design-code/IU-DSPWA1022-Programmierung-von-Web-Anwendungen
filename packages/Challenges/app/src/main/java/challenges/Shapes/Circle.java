package challenges.Shapes;

public class Circle implements Shape {

    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // TODO: Implement this method
        return -1;
    }

}
