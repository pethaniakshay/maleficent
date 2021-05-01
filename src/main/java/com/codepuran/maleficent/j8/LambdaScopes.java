package com.codepuran.maleficent.j8;

public class LambdaScopes {

    public static void main(String[] args) {
        int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        stringConverter.convert(2);     // 3

        //Try with uncommenting this
        //num = 3;
    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
