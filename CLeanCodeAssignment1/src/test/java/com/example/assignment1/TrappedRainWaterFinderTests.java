package com.example.assignment1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappedRainWaterFinderTests {
    @Test
    public void test1(){
        TrappedRainWaterFinder trappedRainWaterFinder=new TrappedRainWaterFinder();
        int inputArray[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int actualOutput=trappedRainWaterFinder.calculate(inputArray);
        int expectedOutput=6;
        assertEquals(expectedOutput,actualOutput);
    }

}