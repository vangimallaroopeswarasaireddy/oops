interface InterfaceA {
    void methodA();
}
interface InterfaceB {
    void methodB();
}
class ParentClass {
    void parentMethod() {
        System.out.println("Parent class method.");
    }
}
class ChildClass extends ParentClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }
}
public class Main1 {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.methodA();
        child.methodB();
        child.parentMethod();
    }
}

