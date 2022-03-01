import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    public int compare(Shape o1, Shape o2) {
        return o1.compareTo(o2);
    }

    public boolean equals(Shape s1, Shape s2) {
        if(s1.getId() == s2.getId()) {
            return true;
        } else {
            return false;
        }
    }
}