public abstract class Quadrilateral extends Shape {
    private double height;
    private double width;

    public Quadrilateral(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    //returns height of quadrilateral
    public double getHeight() {
        return height;
    }

    //returns width of quadrilateral
    public double getWidth() {
        return width;
    }
}

