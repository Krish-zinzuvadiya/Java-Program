/* QB272	
Write a Java program that takes in a list of student names and their 
grades from the user and stores them in a HashTable. The program 
should then prompt the user for a student name and output their 
grade. If the student name is not found in the HashTable, the 
program should output an error message.*/

import java.util.Hashtable;
import java.util.Scanner;

public class StudentGradeLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, Integer> studentGrades = new Hashtable<>();

        // Input student names and grades
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            studentGrades.put(name, grade);
        }

        // Lookup student grade
        System.out.print("Enter student name to lookup grade: ");
        String nameToLookup = scanner.nextLine();

        Integer grade = studentGrades.get(nameToLookup);

        if (grade != null) {
            System.out.println("Grade for " + nameToLookup + ": " + grade);
        } else {
            System.out.println("Error: Student not found.");
        }

        scanner.close();
    }
}
