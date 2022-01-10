import java.util.*;
public class SlotMachine {

    private int [] slot1, slot2, slot3;


    int counter;
    private Random rand;

    public SlotMachine() {
        slot1 = new int[3];
        slot2 = new int[3];
        slot3 = new int[3];
        rand = new Random();
        gambleMachine();
        boolean win = isWinner();
    }
    
    public void gambleMachine() {
        for(int i = 0; i < slot1.length; i++) {
            slot1[i] = rand.nextInt(10);
            slot2[i] = rand.nextInt(10);
            slot3[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(slot1));
        System.out.println(Arrays.toString(slot2));
        System.out.println(Arrays.toString(slot3));
    }

    public boolean isWinner() {
        if(slot[0] == slot[1] && slot[0] == slot[2]) {
            counter++;
            return true;
        }
        return false;
    }
}
