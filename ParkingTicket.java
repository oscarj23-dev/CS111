//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine, baseFine, hourlyFine;
    private int minutes;

    //sets values of the field
    public ParkingTicket(ParkedCar aCar, PoliceOfficer cop, int meterMins) {
        car = aCar;
        officer = cop;
        minutes = meterMins;
        baseFine = 30;
        hourlyFine = 10;
    }

    //copy constructor for security reasons (Should not pass object but a referencs ot object)
    public ParkingTicket(ParkingTicket ticket) {
        car = ticket.car;
        officer = ticket.officer;
        minutes = ticket.minutes;
        baseFine = ticket.baseFine;
        hourlyFine = ticket.hourlyFine;
    }

    //calculates fine if a ticket is issued
    public void calculateFine() {
        if(car.getMinutes() > minutes) {
            fine += baseFine;
            if ((car.getMinutes() - minutes) / 60.0 > 1.0) {
                double time = Math.ceil((car.getMinutes() - minutes) / 60.0);
                fine += time * hourlyFine;
            }
        } 
    }

    //prints info of the ticket
    public String toString() {
        return "Ticket Data: \nMinutes Illegally parked: " + (car.getMinutes() - minutes) + "\nFine: $"
        + fine;
    }

    //returns the fine
    public double getFine() {
        return fine;
    }
}
