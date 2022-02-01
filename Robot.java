//Oscar Maldonado
//CS111
//Tatiana Morris
//1/23/2022
import java.util.*;
public class Robot {
    private static int numRobots;
    RobotHead robotHead;
    RobotTorso robotTorso;
    private String serialID;
    private Random r;

    //The construcotr increments the number of robots, creates a serial ID and a 
    //new torso and head
    public Robot() {
        numRobots++;
        r = new Random();
        serialID = "Johnny" + r.nextInt(99999) + " ";
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();
    }
    
    //returns the number of robots currently in the garage
    public int getRobotCount() {
        return numRobots;
    }

    //returns the serial ID of the robots
    public String getSerialID() {
        return serialID;
    }

    //sets the serial ID of the robots
    public void setSerialID(String serial) {
        serialID = serial;
    }
    
    //compares the robots to see if their equal by comparing serialID's
    public boolean equals(Robot aRobot) {
        boolean cond = true;
        if(serialID.equals(aRobot.getSerialID())) {
            return cond;
        } else {
            return !cond;
        }
    }

    //Prints the robots info
    public String toString() {
        return "Serial ID: " + serialID + robotHead.toString() + robotTorso.toString() + " ";
    }

    //makes a copy of a robot's serial ID
    public Robot copy() {
        Robot robotCopy = new Robot();
        robotCopy.setSerialID(serialID);
        return robotCopy;
    }
}
