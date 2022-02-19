import java.util.*;
public class SleepRoom extends Room {

    public SleepRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
    }

    //playRoom method overridden to contain the sleep case
    public int playRoom(CustomPlayer player) {
        String command;
        int newRoomNum = super.getRoomNum();
        Scanner keyboard = new Scanner(System.in);
        command = keyboard.nextLine();

        // switch on the user's command
        switch (command) {
            case "exits":
                printListOfExits();
                break;
            case "look":
                printObjectsInRoom();
                break;
            case "inventory":
                player.printInventory();
                break;
            case "go west":
            case "go east":
            case "go south":
            case "go north":
                newRoomNum = leaveRoom(command);
                break;
            case "quit":
                player.setContinuePlay(false);
                break;
            case "pick up":
                userPicksUp(player);
                break;
            case "drop":
                userDrops(player);
                break;
            case "help":
                Utilities.printHelp();
                break;
            case "sleep":
            player.sleepOnStraw(player);
            break;
            default:
                System.out.println("Invalid command. Type help for details.");
        }
        return newRoomNum;
    }
    
}
