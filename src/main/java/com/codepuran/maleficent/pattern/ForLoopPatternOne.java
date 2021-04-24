package com.codepuran.maleficent.pattern;

/*
Pattern that I asked in one of interview

1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
 */


public class ForLoopPatternOne {
    public static void main(String[] args) {
        for(int i=1; i<= 8; i++) {

            int jI = 1;
            int jS;

            if(i%2 == 0) {
                jI = 2;
                jS = jI * i;
            } else {
                jS = (i * 2) - 1;
            }

            for(int j=jI; j <= jS; j += 2) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
