public abstract class Shape implements Comparable<Shape> {
    private int numShapes;
    private int id;

    public int getNumShape() {
        return numShapes;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Shape s) {
        if(numShapes > s.numShapes) {
            return 1;
        } else if(numShapes == s.numShapes) {
            return 0;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "This shape has: " + numShapes + " and its id is: " + id;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getShapeType();
}
