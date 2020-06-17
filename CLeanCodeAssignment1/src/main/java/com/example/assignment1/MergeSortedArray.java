package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    private List<Integer> mergerdList = new ArrayList<>();

    public List<Integer> merge(int[] array1, int[] array2) {
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j])
                this.mergerdList.add(array1[i++]);
            else
                this.mergerdList.add(array2[j++]);
        }

        while (i < array1.length)
            this.mergerdList.add(array1[i++]);
        while (j < array2.length)
            this.mergerdList.add(array2[j++]);

        return this.mergerdList;
    }
}
