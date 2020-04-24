package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*public class ExerciseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        //System.out.print(nums);

        for (int i : nums) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
*/

public class ExerciseArrayList {
    public static void main(String[] args) {
        //String letters = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //String letters ="would";
        ArrayList<String> fiveLetters = new ArrayList<>();

        fiveLetters.add("would");
        fiveLetters.add("April");
        fiveLetters.add("Abe");
        //String[] words = fiveLetters.split("@");
       // System.out.print(words);

        for (String c : fiveLetters) {
            if (c.length()==5) {
                System.out.println(c);
            }
        }
    }
}


/*
            alist.add("April");
            alist.add("March");

            //System.out.print(alist);

        Scanner input = new Scanner(System.in);
        String words;
        System.out.println("Enter your words for the search:");
        String search = input.next();*/







