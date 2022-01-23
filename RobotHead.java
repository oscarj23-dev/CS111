import java.util.*;
public class RobotHead {
    private String eyeColor;
    private Random r;
    private String [] colors = {"blue", "yellow", "evil red", "creepy green", "muddy brown"};

    public RobotHead() {
        eyeColor = colors[r.nextInt(5)];
    }

    public String toString() {
        String output = "eye color: " + eyeColor; 
        System.out.println(output);
        return output;
    }

}
