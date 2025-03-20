
class Person {
     private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
    
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setName("Bob");
        p.setAge(30);

        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());

        p.setAge(-5);
    }
}
