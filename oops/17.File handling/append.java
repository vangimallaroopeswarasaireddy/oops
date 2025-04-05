import java.io.FileWriter; 
import java.io.IOException;
public class append {
public static void main(String[] args){ 
try {
FileWriter writer = new FileWriter("easy.txt", true); 
writer.write("\nAppended line.");
writer.close(); 
System.out.println("Text appended.");
} catch (IOException e) { 
System.out.println("Error:" + e.getMessage());
}
}
}