package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class AliceMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your search word:");
        String word = input.nextLine().toLowerCase();
        System.out.println(word);
    }
}
