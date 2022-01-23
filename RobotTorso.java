import java.util.*;
public class RobotTorso {
    private int numArms;
    private Random r;
    public RobotTorso() {
        numArms = r.nextInt(12);
    }

    public String toString() {
        String output = "number of arms: " + numArms; 
        System.out.println(output);
        return output;
    }

}