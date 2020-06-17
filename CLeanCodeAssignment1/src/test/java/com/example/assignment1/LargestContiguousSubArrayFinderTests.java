package com.example.assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestContiguousSubArrayFinderTests {

    @Test
    public void test1() {
        LargestContiguousSubArrayFinder largestContiguousSubArrayFinder = new LargestContiguousSubArrayFinder();
        int[] inputArray = {-2, -3, 4, -1, -2, 1, 5, -3};
        int actualValue = largestContiguousSubArrayFinder.calculate(inputArray);
        int expectedValue = 7;
        assertEquals(expectedValue, actualValue);
    }

}