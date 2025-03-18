class Animal {
    public Animal getAnimal() {
        return new Animal();
    }
}
class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
public class Main2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal dog = animal.getAnimal();  
        System.out.println(dog.getClass().getSimpleName());  
    }
}
