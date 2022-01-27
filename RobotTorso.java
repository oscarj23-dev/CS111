//Oscar Maldonado
//CS111
//Tatiana Morris
//1/23/2022
import java.util.*;
public class RobotTorso {
    private int numArms;
    private Random r;
    
    //creats the amount of arms a robot will have
    public RobotTorso() {
        r = new Random();
        numArms = r.nextInt(12);
    }

    //returns the amount of arms a robot has in a string
    public String toString() {
        return "number of arms: " + numArms + " ";
    }

}