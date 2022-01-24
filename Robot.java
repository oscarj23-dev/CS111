import java.util.*;
public class Robot {
    private static int numRobots;
    RobotHead robotHead;
    RobotTorso robotTorso;
    private String serialID;
    private Random r;

    public Robot() {
        numRobots++;
        r = new Random();
        serialID = "Johnny" + r.nextInt(99999) + " ";
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
        boolean cond = true;
        if(serialID.equals(aRobot.getSerialID())) {
            return cond;
        } else {
            return !cond;
        }
    }

    public String toString() {
        return "Serial ID: " + serialID + robotHead.toString() + robotTorso.toString() + " ";
    }

    public Robot copy() {
        Robot robotCopy = new Robot();
        robotCopy.setSerialID(serialID);
        return robotCopy;
    }
}
