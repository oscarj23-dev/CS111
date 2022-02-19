import java.util.*;
public class CustomPlayer extends Player {
    protected double vitPoints;
    private Random r;

    public CustomPlayer(String name, int room, String inventory, Scanner keyboard) {
        super(name, room, inventory);
        keyboard = new Scanner(System.in);
        vitPoints = keyboard.nextDouble();
        r = new Random();
        
    }

    //method to add to vitPoints
    protected void addToVitalityPoints(double pointsToAdd) {
        vitPoints += pointsToAdd;
    }

    //prints vitPoints
    protected void printVitalityPoints() {
        System.out.println(vitPoints);
    }

    //returns current points
    public double getPoints() {
        return vitPoints;   
    }

    //prints player inventory w/ vitPoints included
    public void printInventory() {
        StringTokenizer strT = new StringTokenizer(getInventory(), ";");
        System.out.println(getName() + "'s items: " + "\nVitality points: " + vitPoints);
        int numItems = 0;
        while (strT.hasMoreTokens()) {
            System.out.println("  " + strT.nextToken());
            numItems++;
        }
        System.out.println("  A total of " + numItems + " item(s)");
    }

    //sleeps the player and adds vit points when they wake up
    public void sleepOnStraw(CustomPlayer player) {
        System.out.println("You are asleep now. Here are your points: " + vitPoints);
        vitPoints += r.nextDouble() * vitPoints;
        System.out.println("Here are your points after waking up: " + vitPoints);
    }
}