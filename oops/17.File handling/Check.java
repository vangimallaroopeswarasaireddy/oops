import java.io.File;
public class Check {
public static void main(String[] args){ 
File file = new File("easy.txt");
if (file.exists()) { 
System.out.println("File found.");
} else {
System.out.println("File not found.");
}
}
}