public class Division {
public static void main(String[] args){ 
int a = 10, b = 0;
try {
int result = a / b; 
System.out.println("Result:" + result);
} catch (ArithmeticException e) { 
System.out.println("Error: Cannot divide by zero.");
}
}
}