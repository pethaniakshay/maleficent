package com.codepuran.maleficent.ib.tp;

import com.codepuran.maleficent.dsa.ib.tp.PairWithGivenDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PairWithGivenDifferenceTest {


    private PairWithGivenDifference pairWithGivenDifference = new PairWithGivenDifference();

    @Test
    public void solveTest_1() {
         Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(10,20)), 10));
    }

    @Test
    public void solveTest_2() {
        Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(10,20, 40, 60)), 20));
    }

    @Test
    public void solveTest_3() {
        Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(20, 40, 60)), 20));
    }

    @Test
    public void solveTest_4() {
        Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322)), 369));
    }

    @Test
    public void solveTest_5() {
        Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(1,2,4,7,11)), 3));
    }

    @Test
    public void solveTest_6() {
        Assertions.assertEquals(1, pairWithGivenDifference.solve(new ArrayList<>(Arrays.asList(1,2,4,7,11,16)), 3));
    }
}
