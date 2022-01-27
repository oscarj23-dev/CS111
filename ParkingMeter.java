public class ParkingMeter {
    private int minutesPurchased;
    
    public ParkingMeter(int numMinPurchased) {
        minutesPurchased = numMinPurchased;
    }

    public int getMinutes() {
        return minutesPurchased;
    }
    
    public String toString() {
        return "" + minutesPurchased;
    }
}
