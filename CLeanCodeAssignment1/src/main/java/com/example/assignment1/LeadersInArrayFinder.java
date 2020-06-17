package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArrayFinder {
    private List<Integer> leader = new ArrayList<>();

    public List<Integer> calculate(int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            int j;
            for (j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] <= inputArray[j])
                    break;
            }
            if (j == inputArray.length) {
                this.leader.add(inputArray[i]);
            }
        }
        return this.leader;
    }
}
