import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        int totalClasses, classesAttended;
        double attendancePercentage;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Total number of classes held
        System.out.print("Enter the total number of classes held: ");
        totalClasses = scanner.nextInt();

        // Input: Number of classes attended
        System.out.print("Enter the number of classes attended: ");
        classesAttended = scanner.nextInt();

        // Calculate the attendance percentage
        attendancePercentage = (double) classesAttended / totalClasses * 100;

        // Output: Display the attendance percentage
        System.out.printf("Your attendance percentage is: %.2f%%\n", attendancePercentage);

        // Decision: Check if the student meets the attendance requirement
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit for the exam.");
        } else {
            System.out.println("Your attendance is too low. You are not allowed to sit for the exam.");
        }

        // Close the scanner
        scanner.close();
    }
}
