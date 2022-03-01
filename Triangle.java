public class Triangle extends Shape{
    private double height, baseWidth, side1Length, side2Length;
    
    public Triangle(double height, double baseWidth, double side1Length, double side2Length) {
        this.height = height;
        this.baseWidth = baseWidth;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    public double getArea() {
        return (baseWidth * height)/2 ;
    }

    public double getPerimeter() {
        return side1Length + side2Length + baseWidth;
    }

    public String getShapeType() {
        return "triangle";
    }
    
}
