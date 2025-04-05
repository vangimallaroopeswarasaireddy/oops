import java.io.File;
public class Delete {
public static void main(String[] args){ 
File file = new File("easy.txt");
if(file.delete()){
System.out.println("File deleted:" + file.getName());
} else {
System.out.println("File not found or couldn't be deleted.");
}
}
}