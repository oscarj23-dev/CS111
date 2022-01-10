
public class Play3000SlotMachines {
    public static void main (String[] args) {
        int counter = 0;
        int wins = 0;
        while(counter < 3000) {
            counter++;
            SlotMachine s = new SlotMachine();
            wins = s.counter;
        }
        System.out.println("from 3000 slot machines, " + wins + " are winners.");
    }
}
