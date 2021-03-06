// sample game demo file

public class GameDemoSimple {

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 3;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2");
        gameBoard[1] = new Room("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2");
        gameBoard[2] = new Room("Green Room", "meowing kitten;", 2, "w1;e0");
        //gameBoard[3] = new Room(roomName, objects, roomNum, listOfExits)

        // keep track of which room player is in 
        int playerRoomNumber = 0;

        // create player object, using the superclass Player
        Player player = new Player("Tatiana", playerRoomNumber, "bubble gum;band-aid;toothpick");

        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber =
                    gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}