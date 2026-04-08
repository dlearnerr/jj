package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreatestNumberTest {

    @Test
    public void testFindGreatestWhenFirstIsGreater() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(20, gn.findGreatest(20, 10, 5));
    }

    @Test
    public void testFindGreatestWhenSecondIsGreater() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(50, gn.findGreatest(10, 50, 30));
    }

    @Test
    public void testFindGreatestWhenThirdIsGreater() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(99, gn.findGreatest(1, 2, 99));
    }

    @Test
    public void testFindGreatestWhenTwoAreEqual() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(50, gn.findGreatest(50, 50, 30));
    }
}
