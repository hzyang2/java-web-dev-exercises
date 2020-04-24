package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        //String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        String str = input.nextLine();
        input.close();

        HashMap<Character, Integer> characters = new HashMap<>();

        char[] characterArray = str.toLowerCase().toCharArray();

        for (char c : characterArray) {
            if (Character.isLetter(c)) {
                if (!characters.containsKey(c)) {
                    characters.put(c, 1);
                } else {
                    Integer currentCount = (characters.get(c)) + 1;
                    characters.replace(c, currentCount);
                }
            }
        } System.out.println(characters);
    }
}
