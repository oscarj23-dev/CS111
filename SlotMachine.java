import java.util.*;
public class SlotMachine {
    private int [] slot1, slot2, slot3;
    private Random rand;

    public SlotMachine() {
        slot1 = new int[3];
        slot2 = new int[3];
        slot3 = new int[3];
        rand  = new Random();
        gambleMachine();
        boolean win = isWinner();
    }
    
    //this method acts as the slot machine, populating 3 arrays of size 3 with random 
    //ints between 0 and 9.
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

    //this method determines which of the arrays are winners through a simple 'if' 
    //chain comparing the elements to eachother.
    public boolean isWinner() { 
        if(slot1[0] == slot1[1] && slot1[0] == slot1[2]) {
            return true;
        } if(slot2[0] == slot2[1] && slot2[0] == slot2[2]) {
            return true;
        } if(slot3[0] == slot3[1] && slot3[0] == slot3[2]) {
            return true;
        }
        return false;
    }
}