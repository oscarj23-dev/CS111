//Oscar Maldonado
//Tatiana Morris
//1/9/22
//CS111
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
    
    //fills all three arrays with random numbers 1-9
    public void gambleMachine() {
        for(int i = 0; i < slot1.length; i++) {
            slot1[i] = rand.nextInt(10);
            slot2[i] = rand.nextInt(10);
            slot3[i] = rand.nextInt(10);
        }
    }

    //determines if a slot is a winner through an if chain and returns true if it is.
    public boolean isWinner() {
        if(slot1[0] == slot1[1] && slot1[0] == slot1[2]) {
            counter++;
            return true;
        }   if(slot2[0] == slot2[1] && slot2[0] == slot2[2]) {
            counter++;
            return true;
        }   if(slot3[0] == slot3[1] && slot3[0] == slot3[2]) {
            counter++;
            return true;
        }
        return false;
    }
}
