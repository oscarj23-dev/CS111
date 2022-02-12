public class CruiseShip extends Ship {
    private int passengers, numPets;
    public CruiseShip(String title, int year, int pass, int pets) {
        super(title, year);
        passengers = pass;
        numPets = pets;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getPets() {
        return numPets;
    }

    public String toString() {
        return "Name: " + super.getName() + "\nType: Cruise Ship\nMaximum Passengers: " + passengers + " \nYear built: " + super.getYearBuilt() + "\nNumber of pets allowed: " + numPets;
    }

}
