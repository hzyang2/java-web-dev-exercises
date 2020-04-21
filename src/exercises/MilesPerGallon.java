package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven:");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas you have consumed:");
        double gas = input.nextDouble();

        double milesPerGallon = miles/gas;
        input.close();
        System.out.println("Your mileage is" +" " + milesPerGallon);
    }
}
