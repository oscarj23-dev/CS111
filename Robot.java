import java.util.*;
public class Robot {
    private static int numRobots;
    RobotHead robotHead;
    RobotTorso robotTorso;
    private String serialID;
    private Random r;

    public Robot() {
        numRobots++;
        serialID = "Johnny" + r.nextInt(99999);
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();
    }
    
    public int getRobotCount() {
        return numRobots;
    }

    public String getSerialID() {
        return serialID;
    }

    public void setSerialID(String serial) {
        serialID = serial;
    }
    
    public boolean equals(Robot aRobot) {
        return false;
    }

    public String toString() {
        String output = "number of robots: " + numRobots; 
        System.out.println(output);
        return output;
    }

    public Robot copy() {
        Robot robotCopy = new Robot();
        robotCopy.setSerialID(serialID);
        return robotCopy;
    }

}
