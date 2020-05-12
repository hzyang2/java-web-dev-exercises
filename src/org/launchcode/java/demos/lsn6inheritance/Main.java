package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

//        HouseCat spike = new HouseCat("Spike");
//        System.out.println(spike.getWeight());

        HouseCat ounce = new HouseCat(12);
        System.out.println(ounce.getWeight());

        HouseCat mittens = new HouseCat(8.4);
        System.out.println(ounce.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

    }
}

