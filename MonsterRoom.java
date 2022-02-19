
public class MonsterRoom extends Room {

    public MonsterRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
        System.out.println("Is this thing working?");
    }

    //overrides the playRoom method and adds functionality
    public int playRoom(Player player) {
        System.out.println("be wary");
        //player.setContinuePlay(false);
        printObjectsInRoom();
        printListOfExits();
        userDrops(player);
        return super.playRoom(player);
    }
}