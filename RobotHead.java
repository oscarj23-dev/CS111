//Oscar Maldonado
//CS111
//Tatiana Morris
//1/23/2022
import java.util.*;
public class RobotHead {
    private String eyeColor;
    private Random r;
    private String [] colors = {"blue", "yellow", "evil red", "creepy green", "muddy brown"};

    //constructor chooses which eye color the robot will have via a random object and a array
    //of strings containing the eye colors
    public RobotHead() {
        r = new Random();
        eyeColor = colors[r.nextInt(5)];
    }

    //returns the eye color of the robot as a string
    public String toString() {
        return "eye color: " + eyeColor + " "; 
    }
}
