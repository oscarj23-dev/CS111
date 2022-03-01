public class Rectangle extends Quadrilateral{

    //constructs rectangle object with call to super class constructor
    public Rectangle(double height, double width) {
        super(height, width);
    }

    //returns area of rectangle
    public double getArea() {
        return (super.getHeight() * super.getWidth());
    }
    //returns perimeter of rectangle
    public double getPerimeter() {
        return 2*(super.getHeight() + super.getWidth());
    }

    //returns type of shape as string
    public String getShapeType() {
        return "Rectangle";
    }
}