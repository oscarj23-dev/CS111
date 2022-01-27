public class PatrolSimulation {
    
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Subaru", "WRX STI", "World Rally blue", "BGH9994", 59);
        ParkedCar car2 = new ParkedCar(car);
        String info = car2.toString();
        System.out.println(info);
    }

}
