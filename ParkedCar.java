//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

public class ParkedCar {
    private String make, model, color, licenseNumber;
    private int minutesParked;

    //Constructor assigning values to fields
    public ParkedCar(String make, String model, String color, String licenseNumber,
    int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    //copy constructor for security reasons (Should not pass object but a referencs ot object)
    public ParkedCar(ParkedCar car2) {
        make = car2.make;
        model = car2.model;
        color = car2.color;
        licenseNumber = car2.licenseNumber;
        minutesParked = car2.minutesParked;
    }

    //returns make
    public String getMake() {
        return make;
    }
    
    //returns model
    public String getModel() {
        return model;
    }

    //returns color
    public String getColor() {
        return color;
    }

    //returns license number
    public String getLicense() {
        return licenseNumber;
    }

    //returns minutes parked
    public int getMinutes() {
        return minutesParked;
    }

    //prints car info
    public String toString() {
        return "Car Data:\nMake: " + make + "\n" +
        "model: " + model + "\n" +
        "color: " + color + "\n" +
        "license number: " + licenseNumber + "\n" +
        "Minutes Parked: " + minutesParked;    
    }
}
