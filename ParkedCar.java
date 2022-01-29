public class ParkedCar {
    private String make, model, color, licenseNumber;
    private int minutesParked;

    public ParkedCar(String make, String model, String color, String licenseNumber,
    int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }
    public ParkedCar(ParkedCar car2) {
        make = car2.make;
        model = car2.model;
        color = car2.color;
        licenseNumber = car2.licenseNumber;
        minutesParked = car2.minutesParked;
    }

    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicense() {
        return licenseNumber;
    }

    public int getMinutes() {
        return minutesParked;
    }

    public void setMake(String make2) {
        make = make2;
    }

    public void setModel(String model2) {
        model = model2;
    }

    public void setColor(String color2) {
        color = color2; 
    }

    public String toString() {
        return "Car Data:\nMake: " + make + "\n" +
        "model: " + model + "\n" +
        "color: " + color + "\n" +
        "license number: " + licenseNumber + "\n" +
        "Minutes Parked: " + minutesParked;    
    }

}
