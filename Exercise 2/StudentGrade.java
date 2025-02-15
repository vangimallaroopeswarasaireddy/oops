import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        double marks = scanner.nextDouble();
        String grade;
        if (marks >= 95) {
            grade = "+A";
        } else if (marks >= 90) {
            grade = "A";
        } else if (marks >= 85) {
            grade = "+B";
        } else if (marks >= 80) {
            grade = "B";
        }else if (marks >= 75) {
            grade = "+C";
        } else if (marks >= 70) {
            grade = "c";
        } else if (marks >= 65) {
            grade = "+D";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("The grade of the student is: " + grade);
        scanner.close();
    }
}
