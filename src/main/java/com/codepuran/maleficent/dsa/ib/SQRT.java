package com.codepuran.maleficent.dsa.ib;

public class SQRT {

    public static void main(String[] args) {
        int i = 2147483647;
        System.out.println("Integer: " + i);
        System.out.println("Answer: " + sqrt(i));
    }

    public static int sqrt(int A) {

        if (A == 0 || A == 1)
            return A;
        // Do Binary Search for floor(sqrt(x))
        long low = 1, high = A  , ans=0;
        while (low <= high)
        {
            long mid =   (low + high) / 2;
            System.out.print("Mid: " + mid);
            long sqr = mid*mid;
            System.out.println(" Square: " + sqr);
            if (sqr == A)
                return (int) mid;
            if (sqr < A)
            {
                low = mid + 1;
                ans = mid;
            }
            else
                high = mid-1;

            System.out.println();
        }
        return (int) ans;
    }
}
