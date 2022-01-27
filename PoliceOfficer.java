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
            PoliceOfficer officer = new PoliceOfficer("John doe", "4788");
            ParkingTicket tic = new ParkingTicket(car, officer, meter.getMinutes());
            return tic;
        } else {
            return null;
        }
    }

    public String toString() {
        return "officer data: \nname: " + name + "\nBadgeNumber: " + badgeNumber;
    }
}
