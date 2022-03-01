public class Circle extends Shape {
    private double radius;

   //constructs circle object and assigns values from passed in parameters to fields
    public Circle(double radi) {
        radius = radi;
    }

    //returns area of circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //returns perimeter of circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //returns shape type
    public String getShapeType() {
        return "Circle";
    }
    
}
