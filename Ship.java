public abstract class Ship {
    private String name;
    private int yearBuilt, numEngines;

    public Ship(String title, int year) {
        name = title;
        yearBuilt = year;
    }

    public String getName() {
        return name;
    }

    public int getEngines() {
        return numEngines;
    }

    public int getYearBuilt() { 
        return yearBuilt;
    }

    public void setEngines(int engines) {
        numEngines = engines;
    }

    public abstract String toString();
}
//
