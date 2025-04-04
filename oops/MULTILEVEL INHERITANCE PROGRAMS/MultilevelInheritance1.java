
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created.");
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    Car() {
        System.out.println("Car is created.");
    }

    @Override
    void start() {
        System.out.println("Car engine starts with a key.");
    }
}


class ElectricCar extends Car {
    ElectricCar() {
        System.out.println("Electric Car is created.");
    }

    @Override
    void start() {
        System.out.println("Electric Car starts silently.");
    }
}


public class MultilevelInheritance1 {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();

        myCar.start(); 
    }
}