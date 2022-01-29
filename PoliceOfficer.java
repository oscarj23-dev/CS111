//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    //sets values of the fields
    public PoliceOfficer(String officerName, String badge) {
        name = officerName;
        badgeNumber = badge;
    }

     //copy constructor for security reasons (Should not pass object but a referencs ot object)
    public PoliceOfficer(PoliceOfficer officer) {
        name = officer.name;
        badgeNumber = officer.badgeNumber;
    }

    //checks if the car is illegally parked, if it is it will issue and return a parkingTicket
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if(meter.getMinutes() < car.getMinutes()) {
            PoliceOfficer officer = new PoliceOfficer(name, badgeNumber);
            PoliceOfficer cop = new PoliceOfficer(officer);
            int minutes = meter.getMinutes();
            ParkingTicket tic = new ParkingTicket(car, cop, minutes);
            return tic;
        } else {
            System.out.println("No violation");
            System.out.println("");
            return null;
        }
    }

    //prints officer data
    public String toString() {
        return "Officer Data: \nname: " + name + "\nBadgeNumber: " + badgeNumber;
    }
}
