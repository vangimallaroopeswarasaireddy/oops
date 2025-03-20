
class Employee {
    
    private String name;
    private int age;
    private double salary;

   
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
        if (age > 18) { // Ensuring valid age
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18!");
        }
    }

   
    public double getSalary() {
        return salary;
    }

   
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }


    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
       
        Employee emp = new Employee("John Doe", 30, 50000);

        emp.displayInfo();

        emp.setName("Alice Smith");
        emp.setAge(25);
        emp.setSalary(60000);

        System.out.println("\nUpdated Employee Details:");
        emp.displayInfo();

        emp.setAge(16); 
        emp.setSalary(-1000);
    }
}
