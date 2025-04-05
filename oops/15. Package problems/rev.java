Package:
package textutils;
public class Reverser {
public String reverse(String str) { 
String result = "";
for (int i = str.length() - 1; i >= 0; i--) { 
result += str.charAt(i);
}
return result;
}
}
Main:
import textutils.Reverser;
public class rev {
public static void main(String[] args) { 
Reverser r = new Reverser(); 
System.out.println(r.reverse("hello"));
}
}