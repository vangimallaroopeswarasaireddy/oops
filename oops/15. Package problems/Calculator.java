Package:
package mathpack;
public class Calculator
{
public int add(int a, int b)
{
return a + b;
}
}
Main:
import mathpack.Calculator; 
public class Main
{
public static void main(String[] args)
{
Calculator c = new Calculator(); 
System.out.println(c.add(3, 4));
}
}