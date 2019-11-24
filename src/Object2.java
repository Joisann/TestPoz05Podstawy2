import Objektowosc.Car;

public class Object2 {
    public static void main(String[] args) {
        Car Opel = new Car("Opel", "Astra", 2006);
        Opel.przyspiesz(60);
        Opel.przyspiesz(20);
        Opel.opiszAuto();
        Car BMW = new Car("BMW", "M5", 2017);
        BMW.przyspiesz(152);
        BMW.opiszAuto();
    }
}