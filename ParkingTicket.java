public class ParkingTicket {
    private ParkedCar car, car2;
    private PoliceOfficer officer;
    private double fine, baseFine, hourlyFine;
    private int minutes;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer cop, int meterMins) {
        car = new ParkedCar("Subaru", "WRX STI", "World Rally blue", "BGH9994", 59);
        car2 = new ParkedCar(car);
        officer = cop;
        minutes = meterMins;
        baseFine = 30;
        hourlyFine = 10;
    }

    public ParkingTicket(ParkingTicket ticket) {
        car = ticket.car2;
        officer = ticket.officer;
        baseFine = ticket.baseFine;
        hourlyFine = ticket.hourlyFine;
    }

    public void calculateFine() {
        if(minutes < car2.getMinutes()) {
            fine += baseFine;
            if ((car2.getMinutes() - minutes) / 60.0 > 0.0) {
                double time = Math.ceil((car2.getMinutes() - minutes) / 60.0);
                fine += time * fine;
            }
        } 
    }

    public double getFine() {
        return fine;
    }
}
