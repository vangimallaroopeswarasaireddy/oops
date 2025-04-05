class InvalidMarkException extends Exception { 
public InvalidMarkException(String message){
super(message);
}
}
class Student {
public void setMark(int mark)throws InvalidMarkException { 
if (mark < 0 || mark > 100) {
throw new InvalidMarkException("Marks should be between 0 and 100.");
}
System.out.println("Valid mark:" + mark);
}
}
public class StudentApp {
public static void main(String[] args){ 
Student student = new Student(); 
try {
student.setMark(105);
} catch (InvalidMarkException e){
System.out.println("Exception:" + e.getMessage());
}
}
}