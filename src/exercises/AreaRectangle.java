package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter width of the rectangle:");
        double width = input.nextDouble();

        double area = length * width;
        input.close();
        System.out.println("The rectangle's area is" +" " + area);
    }
}
