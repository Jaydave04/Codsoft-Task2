package Codsoft.com;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double Percentage = (double) totalMarks / numSubjects;

        char grade;
        if (Percentage >= 90) {
            grade = 'A';
        } else if (Percentage >= 75) {
            grade = 'B';
        } else if (Percentage >= 60) {
            grade = 'C';
        } else if (Percentage >= 50) {
            grade = 'D';
        } else if (Percentage >= 35) {
        	grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", Percentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
