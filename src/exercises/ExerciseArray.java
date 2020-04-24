package exercises;

import java.util.Arrays;
import java.util.Scanner;

/*public class ExerciseArray {
    public static void main(String[] args) {
        int []numbers = {1, 1, 2, 3, 5, 8};
        for (int i : numbers) {
            if (i % 2 != 0) {
                System.out.println(i);
                //}
            }
        }
    }
}
*/

public class ExerciseArray {
    public static void main(String[] args) {
        String letters = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = letters.split("\\.. ");
        System.out.println(Arrays.toString(words));
    }
}


