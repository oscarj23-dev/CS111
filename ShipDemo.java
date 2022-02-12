public class ShipDemo {
    public static void main(String[] args) {
        final int numShips = 3;
        Ship [] ships = new Ship[numShips];

        ships[0] = new CargoShip("Big bess", 1984, 20000, false);
        ships[1] = new CargoShip("Big hoss", 1932, 10000, true);
        ships[2] = new CruiseShip("Titanic", 1909, 3300, 12);

        String info;
        for(int i = 0; i < ships.length; i++) {
            info = ships[i].toString();
            System.out.println(info);
            System.out.println();
        }
    }
}
