package com.codepuran.maleficent.dsa.ib.jva;

import java.util.Scanner;

public class StdInAndStdOut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String a[] = s.split("\\s+");

        for(String z : a) {
            System.out.println(z);
        }
    }


}
