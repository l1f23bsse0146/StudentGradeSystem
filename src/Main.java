import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");

        // --- MODIFIED WITH TRY-CATCH EXCEPTION HANDLING ---
        int marks = 0;
        try {
            marks = input.nextInt();

            if(marks < 0 || marks > 100)
                throw new Exception("Invalid Marks");

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return; // Exits the program early if marks are invalid
        }
        // --------------------------------------------------

        String grade;

        if(marks >= 80)
            grade = "A";
        else if(marks >= 70)
            grade = "B";
        else if(marks >= 60)
            grade = "C";
        else
            grade = "Fail";

        double percentage = (marks / 100.0) * 100;

        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);

        if(marks >= 50)
            System.out.println("Status: Pass");
        else
            System.out.println("Status: Fail");
    }
}