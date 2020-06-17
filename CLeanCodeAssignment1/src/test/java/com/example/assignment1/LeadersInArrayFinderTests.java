package com.example.assignment1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeadersInArrayFinderTests {

    @Test
    public void test1() {
        LeadersInArrayFinder leadersInArrayFinder = new LeadersInArrayFinder();
        int[] input = {16, 17, 4, 3, 5, 2};
        List<Integer> expectedOutput = Arrays.asList(17, 5, 2);
        List<Integer> actualOutput = leadersInArrayFinder.calculate(input);
        assertEquals(expectedOutput, actualOutput);
    }

}