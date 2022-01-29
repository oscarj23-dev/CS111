public class PatrolSimulation {
    
    public static void main(String[] args) {
        ParkedCar[] car = new ParkedCar[3];
        car[0] = new ParkedCar("Subaru", "WRX STI", "World Rally Blue", "BGH2313", 61);
        car[1] = new ParkedCar("Dodge", "Viper ACR", "Adrenaline red", "KFW 2873", 30);
        car[2] = new ParkedCar("Mercedes", "C63 AMG", "Polar White", "ACK 9834", 138);
        ParkingMeter[] meter = new ParkingMeter[3];
        meter[0] = new ParkingMeter(40);
        meter[1] = new ParkingMeter(45);
        meter[2] = new ParkingMeter(60);
        ParkingTicket[] ticket = new ParkingTicket[3];
        PoliceOfficer officer = new PoliceOfficer("Alex Strike", "9994");
        PoliceOfficer cop = new PoliceOfficer(officer);

        for (int i = 0; i < car.length; i++) {
            System.out.println("Car/Parking Meter " + (i + 1) + ":");
            if(cop.patrol(car[i], meter[i]) != null) {
                ticket[i] = new ParkingTicket(car[i], cop, meter[i].getMinutes());
                System.out.println(car[i].toString() + "\n\n" + cop.toString() + "\n");
                ticket[i].calculateFine();
                System.out.println(ticket[i].toString());
                System.out.println("");
            }
        }
    }
}
