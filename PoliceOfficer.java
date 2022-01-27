public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String officerName, String badge) {
        name = officerName;
        badgeNumber = badge;
    }

    public PoliceOfficer(PoliceOfficer officer) {
        name = officer.name;
        badgeNumber = officer.badgeNumber;
    }

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        if(meter.getMinutes() > car.getMinutes()) {
            PoliceOfficer officer = new PoliceOfficer(name, badgeNumber);
            PoliceOfficer cop = new PoliceOfficer(officer);
            ParkingTicket tic = new ParkingTicket(car, cop, meter.getMinutes());
            return tic;
        } else {
            System.out.println("No violation");
            return null;
        }
    }

    public String toString() {
        return "Officer Data: \nname: " + name + "\nBadgeNumber: " + badgeNumber;
    }
}
