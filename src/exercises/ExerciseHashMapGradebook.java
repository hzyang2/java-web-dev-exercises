package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseHashMapGradebook {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newId = 0;

        System.out.println("Enter your ID number:");

        // Get ID and Student names
        do {

            System.out.print("ID: ");
            newId = input.nextInt();

            if (!input.equals("")) {
                System.out.print("Student: ");
                String newStudent = input.next();
                students.put(newId, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!input.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        //double sum = 0.0;

        for (Map.Entry<Integer, String> ID : students.entrySet()) {
            System.out.println(ID.getKey() + " (" + ID.getValue() + ")");

        }
    }
}





