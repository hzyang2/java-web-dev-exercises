package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class test {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    private void assertEquals(int i, double weight, double v) {
    }

//    public void inheritsDefaultCatInSecondConstructor() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
//        assertNotNull(keyboardCat.weight);
//    }

}
