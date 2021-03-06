//Oscar Maldonado
//CS111
//Tatiana Morris
//1/23/2022
public class RobotFactory {
    public static void main(String[] args) {

        //creates an array of three robot objects and initializing the last one to be a copy of one
        Robot [] robo = new Robot[3];
        robo[0] = new Robot();
        robo[1] = new Robot();
        robo[2] = robo[1].copy();
        //prints out the information of all robots
        String call1 = robo[0].toString();
        String call2 = robo[1].toString();
        String call3 = robo[2].toString();
        System.out.println("Robot1: " + call1);
        System.out.println("Robot2: " + call2);
        System.out.println("Robot3: " + call3);
        System.out.println("The number of robots in the garage is: " + robo[0].getRobotCount());
        //logic structure to decide which robots are the same by using the .equals() method
        if(robo[0].equals(robo[1])) {
            System.out.println("The first and second robots have the same serial ID");

        } else if(robo[0].equals(robo[2])) {
            System.out.println("The first and third robots have the same serial ID");
            
        } else {
            System.out.println("The second and third robots have the same serial ID");
        }
    }
}
