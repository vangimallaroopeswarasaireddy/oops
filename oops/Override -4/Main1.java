
class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a roar");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}

