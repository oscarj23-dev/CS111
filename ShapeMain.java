public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.4, 11.9);
        double area = rect.getArea();
        System.out.println(area);
        Circle circ = new Circle(12.4);
        double radius = circ.getArea();
        System.out.println(radius);
        Triangle tri = new Triangle(12.4, 10.0, 8.7, 9.5);
        double ar = tri.getArea();
        System.out.println(ar);
    }
}
