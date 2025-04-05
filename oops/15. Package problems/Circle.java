public class Circle { 
private double radius;
public Circle(double radius){ 
this.radius = radius;
}
public double getArea(){
return Math.PI * radius * radius;
}
}
2. package shapes;
public class Rectangle {
private double length, width;
public Rectangle(double length, double width) { 
this.length = length;
this.width = width;
}
public double getArea(){ 
return length * width;
}
}
Main:
import shapes.Circle; 
import shapes.Rectangle; 
public class Pack2 {
public static void main(String[] args){ 
Circle c = new Circle(5);
Rectangle r = new Rectangle(4, 6); 
System.out.println("Circle Area: " + c.getArea()); 
System.out.println("Rectangle Area:" + r.getArea());
}
}