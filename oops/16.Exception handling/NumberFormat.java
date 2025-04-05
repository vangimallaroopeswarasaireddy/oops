public class NumberFormat {
public static void main(String[] args){ 
String number = "abc";
try {
int num = Integer.parseInt(number); 
System.out.println("Number is:" + num);
} catch (NumberFormatException e) { 
System.out.println("Error: Invalid number format.");
}
}
}