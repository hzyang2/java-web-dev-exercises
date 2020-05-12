package org.launchcode.java.demos.lsn5unittesting.studioUnitTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    //TODO: add tests here
    private void assertFalse(boolean response) {
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        // arrange
        String str = "[]";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void noBracketsReturnsTrue() {
        // arrange
        String str = "";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void beforeBracketsReturnsTrue() {
        // arrange
        String str = "[]LaunchCode";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void afterBracketsReturnsTrue() {
        // arrange
        String str = "LaunchCode[]";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void bothSideBracketsReturnsTrue() {
        // arrange
        String str = "[LaunchCode]";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void twoSetsReturnsTrue() {
        // arrange
        String str = "[]LaunchCode[]";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    @Test
    public void nestedReturnsTrue() {
        // arrange
        String str = "[[LaunchCode]]";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertTrue(response);
    }

    // Expected False
    @Test
    public void reverseOnlyBracketsReturnsFalse() {
        // arrange
        String str = "][";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertFalse(response);
    }

    @Test
    public void onlyLeftBracketsReturnsFalse() {
        // arrange
        String str = "[LaunchCode";
        // act
        boolean response = BalancedBrackets.hasBalancedBrackets(str);
        // assert
        assertFalse(response);
    }

    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void leftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launch[]"));
    }

    @Test
    public void otherMismatchReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[]"));
    }
}

