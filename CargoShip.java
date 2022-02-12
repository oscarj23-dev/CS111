public class CargoShip extends Ship {
    private int numTons;
    private boolean hasDoubleHull;


    public CargoShip(String title, int year, int tons, boolean doubleHull) {
        super(title, year);
        numTons = tons;
        hasDoubleHull = doubleHull;
    }

    public boolean isDoubleHull() {
        return hasDoubleHull;
    }

    public int getTons() { 
        return numTons;
    }
    public String toString() {
        return  "Name: " + super.getName() + "\nType: Cargo Ship\nCargo Capacity: " + numTons + " tons\nYear built: " + super.getYearBuilt() + "\nDouble hull: " + isDoubleHull();
    }
    //"The name of this vessel is " + super.getName() + "it can pull " + numTons + " tons\nAnd it was built in " + super.getYearBuilt();
    
}
