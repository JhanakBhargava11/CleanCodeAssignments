package com.example.assignment1;

public class LargestContiguousSubArrayFinder {
    public int calculate(int inputArray[]) {
        int maximumSoFar = Integer.MIN_VALUE, maximumEndPoint = 0;

        for (int i = 0; i < inputArray.length; i++) {
            maximumEndPoint = maximumEndPoint + inputArray[i];
            if (maximumSoFar < maximumEndPoint)
                maximumSoFar = maximumEndPoint;
            if (maximumEndPoint < 0)
                maximumEndPoint = 0;
        }
        return maximumSoFar;
    }
}
