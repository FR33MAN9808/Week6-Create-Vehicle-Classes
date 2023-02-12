import Car.Car;
import Truck.Truck;

public class App {
    public static void main(String[] args) throws Exception {
    Truck HATCHBACK = new Truck("Hatchback", "Ford", 4, 100, true, true, true, false, false);
    System.out.println(HATCHBACK);
    Car SEDAN = new Car("Sedan", "Toyota", 4, 180, true, true, true, false);
    System.out.println(SEDAN);
    }

}
