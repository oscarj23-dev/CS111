public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine, baseFine, hourlyFine;
    private int minutes;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer cop, int meterMins) {
        car = aCar;
        officer = cop;
        minutes = meterMins;
        baseFine = 30;
        hourlyFine = 10;
    }

    public ParkingTicket(ParkingTicket ticket) {
        car = ticket.car;
        officer = ticket.officer;
        minutes = ticket.minutes;
        baseFine = ticket.baseFine;
        hourlyFine = ticket.hourlyFine;
    }

    public void calculateFine() {
        if(minutes < car.getMinutes()) {
            fine += baseFine;
            if ((car.getMinutes() - minutes) / 60.0 > 0.0) {
                double time = Math.ceil((car.getMinutes() - minutes) / 60.0);
                fine += time * fine;
            }
        } 
    }

    public String toStrng() {
        return "Ticket Data: \nMinutes Illegally parked: " + (car.getMinutes() - minutes) + "\nFine: "
        + fine;
    }

    public double getFine() {
        return fine;
    }
}
