package XVIIokt;

public class Circle extends Shape{
    private double radius;

    @Override
    public double area() {
        return (radius*radius) * 3.14 ;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
