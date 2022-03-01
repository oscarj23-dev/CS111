public class Triangle extends Shape{
    private double height, baseWidth, side1Length, side2Length;
    
    //constructs triangle object and assigns values from passed in parameters to fields
    public Triangle(double height, double baseWidth, double side1Length, double side2Length) {
        this.height = height;
        this.baseWidth = baseWidth;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
    }

    //returns area of triangle
    public double getArea() {
        return (baseWidth * height)/2 ;
    }

    //returns perimeter of triangle
    public double getPerimeter() {
        return side1Length + side2Length + baseWidth;
    }


    //returns type of object as string
    public String getShapeType() {
        return "triangle";
    }
    
}
