
class Parent {
    protected void display() {
        System.out.println("Parent display method");
    }
}
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child display method");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
