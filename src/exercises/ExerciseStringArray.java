package exercises;

import java.util.Scanner;


public class ExerciseStringArray {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter your sentence: ");
        String s = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String t = s.replace(" ", "@");

        for (char words : t.toCharArray()) {
            //String[] word = words.split("@", 100);
            System.out.print(words);
        }
        //String[] words = t.split("@", 100);
        //System.out.print(words[2]);

       //for (String a : words) {
         //   System.out.print(a.toString());

       // for (int i=0; i<words.length; i++) {
          //  System.out.print(words[i]);
        }
    }




