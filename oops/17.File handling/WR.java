import java.io.*;
public class WR {
public static void main(String[] args){ 
String fileName = "sample.txt";
try {
FileWriter writer = new FileWriter(fileName); 
writer.write("Hello, this is a Sample\nWelcome!"); 
writer.close();
FileReader reader = new FileReader(fileName); 
int ch;
while ((ch = reader.read()) != -1){ 
System.out.print((char) ch);
}
reader.close();
} catch (IOException e) {
System.out.println("File error:" + e.getMessage());
}
}
}