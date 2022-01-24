import java.util.*;
public class RobotHead {
    private String eyeColor;
    private Random r;
    private String [] colors = {"blue", "yellow", "evil red", "creepy green", "muddy brown"};

    public RobotHead() {
        r = new Random();
        eyeColor = colors[r.nextInt(5)];
    }

    public String toString() {
        return "eye color: " + eyeColor + " "; 
    }
}
