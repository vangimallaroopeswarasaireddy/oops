
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    String getInfo() {
        return "Brand: " + brand;
    }
}


class Car extends Vehicle {
    int wheels = 4;

    Car(String brand) {
        super(brand); // Call parent constructor
    }

    String getCarInfo() {
        return getInfo() + ", Wheels: " + wheels;
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        System.out.println(myCar.getCarInfo());  // Output: Brand: Toyota, Wheels: 4
    }
}