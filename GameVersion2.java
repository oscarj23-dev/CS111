public class GameVersion2 {
    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 4;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        
        gameBoard[1] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2");
        gameBoard[3] = new Room("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2");
        gameBoard[0] = new Room("Green Room", "meowing kitten;", 2, "w1;e0");
        gameBoard[2] = new MonsterRoom("Monster Room", "1 direwolf;1 white walker;1 vanquished", 3, "w0;e1");

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
