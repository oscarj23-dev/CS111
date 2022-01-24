import java.util.*;
public class RobotTorso {
    private int numArms;
    private Random r;
    public RobotTorso() {
        r = new Random();
        numArms = r.nextInt(12);
    }

    public String toString() {
        return "number of arms: " + numArms + " ";
    }

}