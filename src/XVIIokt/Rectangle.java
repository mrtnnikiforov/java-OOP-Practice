package XVIIokt;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) * 2;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
