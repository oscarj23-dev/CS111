public class Circle extends Shape {
    private double radius;

    public Circle(double radi) {
        radius = radi;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getShapeType() {
        return "Circle";
    }
    
}
