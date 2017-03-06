package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class Gradebook {

    public static void main(String[] args) {
        // initialize 2 objects with data type  string and double

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        //In this example, we prompt the user for a name, which we read in via in.nextLine() when they hit the enter key.
        do {
            newStudent = in.nextLine();
        /*each student that entered (that is, each non-empty line),
        we add the new string to the end of our list with students.add(newStudent)
        */
            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades
        //
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = in.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }

}
