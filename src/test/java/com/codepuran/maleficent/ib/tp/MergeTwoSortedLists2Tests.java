package com.codepuran.maleficent.ib.tp;

import com.codepuran.maleficent.dsa.ib.tp.MergeTwoSortedLists2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedLists2Tests {

    private MergeTwoSortedLists2 mtsl2 = new MergeTwoSortedLists2();

    @Test
    public void mergeTest_1() {
        var a = new ArrayList<>(Arrays.asList(1,2));
        var b = new ArrayList<>(Arrays.asList(-1,2));
        mtsl2.merge(a,b);
        Assertions.assertEquals(Arrays.asList(-1,1,2,2), a);
    }

    @Test
    public void mergeTest_2() {
        var a = new ArrayList<>(Arrays.asList(-4,3));
        var b = new ArrayList<>(Arrays.asList(-2,-2));
        mtsl2.merge(a,b);
        Assertions.assertEquals(Arrays.asList(-4,-2,-2,3),a);
    }
}
