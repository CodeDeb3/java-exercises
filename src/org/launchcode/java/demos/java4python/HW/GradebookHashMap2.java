package org.launchcode.java.demos.java4python.HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
// exercise 4 enter id and print name instead of grades

public class GradebookHashMap2 {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentId;


        System.out.println("Enter your student ID (or ENTER to finish) or 0 to finish: ");

        // Get student names
        do {

            System.out.print("ID: ");
            newStudentId = in.nextInt();


            if (newStudentId !=0){
                System.out.print("Name: ");
                String newName = in.next();     // next student to add to list
                students.put(newStudentId, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        }

        while(newStudentId !=0);

        // Print class roster
        System.out.println("\nClass roster:");
        Double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}
