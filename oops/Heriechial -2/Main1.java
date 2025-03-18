class Employee {
    String name;
    double salary;    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    void showManagerDetails() {
        displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Call parent constructor
        this.programmingLanguage = programmingLanguage;
    }
    void showDeveloperDetails() {
        displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 80000, 5);
        Developer developer = new Developer("Bob", 60000, "Java");
        manager.showManagerDetails();
        System.out.println();
        developer.showDeveloperDetails();
    }
}