package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void beforeBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void afterBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void bothSideBracketsReturnsTrue() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

}
