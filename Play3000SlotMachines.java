public class Play3000SlotMachines {
    public static void main (String[] args) {
        int counter = 0;
        int winCounter = 0;
        boolean wins;
        while(counter < 3000) {
            counter++;
            SlotMachine s = new SlotMachine();
            wins = s.isWinner();
            if(wins) {
                winCounter++;
            }
            if(counter == 3000) {
                System.out.println("from 3000 Slot Machines, " + winCounter + " were winners.");
            }
        }
    }
} 