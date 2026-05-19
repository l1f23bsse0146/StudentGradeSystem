import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        int marks = input.nextInt();

        String grade;

        if(marks >= 80)
            grade = "A";
        else if(marks >= 70)
            grade = "B";
        else if(marks >= 60)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
    }
}