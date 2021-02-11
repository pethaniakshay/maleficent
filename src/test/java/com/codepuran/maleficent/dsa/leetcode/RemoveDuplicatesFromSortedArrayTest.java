package com.codepuran.maleficent.dsa.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    public void removeDuplicatesTest_1(){
        int input[] = {1,1,2};
        Assertions.assertEquals(2,removeDuplicatesFromSortedArray.removeDuplicates(input));
    }

    @Test
    public void removeDuplicatesTest_2(){
        int input[] = {0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5,removeDuplicatesFromSortedArray.removeDuplicates(input));
    }

    @Test
    public void removeDuplicatesTest_3(){
        int input[] = {0,0,1,1,1,2,2,3,3,4,5,6,7,9,9,10};
        Assertions.assertEquals(10,removeDuplicatesFromSortedArray.removeDuplicates(input));
    }

    @Test
    public void removeDuplicatesTest_4(){
        int input[] = {0,10,10,11};
        Assertions.assertEquals(3,removeDuplicatesFromSortedArray.removeDuplicates(input));
    }
}
