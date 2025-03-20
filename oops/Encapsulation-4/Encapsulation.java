class Student {
    private String name;  // Private variable (Encapsulation)

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
  
        s.setName("Alice");
        System.out.println("Student Name: " + s.getName());
    }
}
