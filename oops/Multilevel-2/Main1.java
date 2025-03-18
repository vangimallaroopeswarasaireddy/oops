class Vehicle {
    String type;
    Vehicle(String type) {
        this.type = type;
    } 
    void showType() {
        System.out.println("Vehicle Type: " + type);
    }
}
class Car extends Vehicle {
    String brand; 
    Car(String type, String brand) {
        super(type); 
        this.brand = brand;
    } 
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}
class SportsCar extends Car {
    int topSpeed;
    SportsCar(String type, String brand, int topSpeed) {
        super(type, brand); 
        this.topSpeed = topSpeed;
    }   
    void showSpeed() {
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}
public class Main1 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Car", "Ferrari", 320);
        sportsCar.showType();  
        sportsCar.showBrand();
        sportsCar.showSpeed();
    }
}