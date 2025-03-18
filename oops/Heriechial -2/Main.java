class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing a square");
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        circle.draw();      
        circle.drawCircle(); 
        square.draw();      
        square.drawSquare(); 
    }
}