package com.codepuran.maleficent.dsa.ib;

public class PowerFunction {

    public static void main(String[] args) {
        PowerFunction pf = new PowerFunction();
        System.out.println("Result: " + pf.pow(71045970,41535484,64735492));
    }

    public int pow(int x, int n, int d) {
        long temp = 1;
        long power;
        if (n == 1){
            power = x;
        }
        else if(n == 0) {
            return 0;
        }
        else {
            if(n!=0 && n%2 != 0) {
                temp = x;
                n = n- 1;
            }
            power = pow(x,n);
            power = power * temp;
        }
        long result = 0;
        if( power < 0 ){
           result = d + power;
           if(result >=0) {
               return (int)result;
           } else {
               return 0;
           }
        } else{
            result = power % d;
        }
        return (int)result;
    }

    public long pow(int x, int n) {
        if (n <= 1) {
            return x;
        }
        long intermediateResult = pow(x,n/2);
        return intermediateResult * intermediateResult;
    }
}
