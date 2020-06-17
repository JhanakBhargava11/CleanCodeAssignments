package com.example.assignment1;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class TrappedRainWaterFinder {
    int calculate(int array[]) {
        int residue = 0;

        for (int i = 1; i < array.length - 1; i++) {
            int leftPillar = array[i];
            for (int j = 0; j < i; j++) {
                leftPillar = max(leftPillar, array[j]);
            }

            int rightPillar = array[i];
            for (int j = i + 1; j < array.length; j++) {
                rightPillar = max(rightPillar, array[j]);
            }

            residue = residue + (min(leftPillar, rightPillar) - array[i]);
        }
        return residue;
    }
}
