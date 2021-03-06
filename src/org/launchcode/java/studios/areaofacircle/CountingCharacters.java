package org.launchcode.java.studios.areaofacircle;

import java.util.*;

public class CountingCharacters {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a string:");

        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //String phrase = input.nextLine();
        //input.close();

        HashMap<Character, Integer> characters = new HashMap<>();

        char[] charactersInString = phrase.toLowerCase().toCharArray();


        for (char c : charactersInString) {
            if (Character.isLetter(c)) {
                //System.out.println(c);
                if (!characters.containsKey(c)) {
                    characters.put(c, 1);
                } else {
                    Integer currentCount = (characters.get(c)) + 1;
                    characters.replace(c, currentCount);
                    //System.out.println(currentCount);
                }
            }
        } System.out.println(characters);
    }
}

