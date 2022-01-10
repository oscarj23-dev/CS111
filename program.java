import java.lang.Math;
public class program {
    //this method calculates the area of a circle
    public void area(double r) {
        double circle = Math.PI * Math.pow(r, 2);
        System.out.println("the area of the circle is " + Math.round(circle * 100.0)/100.0 + 
        " sq units");
    }

    //this method calculates the area of a rectangle
    public void area(int x, int y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    //this method calculates the area of a cylinder
    public void area(double r, double h) {
        double cylinder = 2 * (Math.PI * Math.pow(r, 2)) + 2 * (Math.PI * r * h);
        System.out.println("the area of the cylinder " + Math.round(cylinder * 100.0)/100.0 + 
        " sq units");
    }
}