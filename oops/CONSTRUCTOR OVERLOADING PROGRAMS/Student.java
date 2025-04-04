public class Student {
    String name;
    int age;

    public Student() {
        name = "Unknown";
        age = 0;
    }

    public Student(String n) {
        name = n;
        age = 18; // Default age
    }

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student("Alice"); 
        Student s3 = new Student("Bob", 22); 

        s1.display(); 
        s2.display(); 
        s3.display(); 
    }
}