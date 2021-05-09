package com.codepuran.maleficent.j8;

public class StringExperiments {

    public static void main(String[] args) {
        String x = "Akshay";
        String y = "Akshay";

        if(x == y) {
            System.out.println("x == y: Same");
        } else {
            System.out.println("x == y: Different");
        }

        String p = new String("Pune");
        String q = new String("Pune");

        if(p == q) {
            System.out.println("p == q: Same");
        } else {
            System.out.println("p == q: Different");
        }
    }
}
