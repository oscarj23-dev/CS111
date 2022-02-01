//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

public class ParkingMeter {
    private int minutesPurchased;
    
    //sets value of the field
    public ParkingMeter(int numMinPurchased) {
        minutesPurchased = numMinPurchased;
    }

    //returns the amount of minutes purchased
    public int getMinutes() {
        return minutesPurchased;
    }
    
    //prints amount of minutes purchased
    public String toString() {
        return "" + minutesPurchased;
    }
}
