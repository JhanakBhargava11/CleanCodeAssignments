package com.example.assignment1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortedArrayTests {

    @Test
    public void test1(){
        MergeSortedArray mergeSortedArray=new MergeSortedArray();
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        List<Integer> actualList=mergeSortedArray.merge(array1,array2);
        List<Integer> expectedList= Arrays.asList(1,2,3,4,5,6,7,8);
        assertEquals(expectedList,actualList);
    }

}