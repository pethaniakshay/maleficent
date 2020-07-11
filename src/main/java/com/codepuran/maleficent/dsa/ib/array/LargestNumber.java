package com.codepuran.maleficent.dsa.ib.array;

import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        System.out.println("Result: " + ln.largestNumber(Arrays.asList(1115,1125,15,31,4561,657,3,9)));
    }

    public String largestNumber(final List<Integer> A) {
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<A.size(); i++){
            if(A.get(i)==0)count++;
        }
        if(count == A.size())return "0";
        Comparator<Integer> comp = new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                String ans1 = ""+a+b;
                String ans2 = ""+b+a;
                long t1 = Long.parseLong(ans1);
                long t2 = Long.parseLong(ans2);
                return -Long.compare(t1, t2);
            }
        };
        Collections.sort(A, comp);
        StringBuilder str = new StringBuilder();
        for (Integer integer : A) {
            str.append(integer);
        }
        return str.toString();
    }

    //My Solution : Not Working
    /* public String largestNumber(final List<Integer> a) {
        List<Integer> input = new ArrayList<>(a);
        specialSort(input,0, input.size() - 1, 0);
        StringBuilder output = new StringBuilder();
        for(Integer n : input){
            output.append(n);
        }
        return output.toString();
    }

    public void specialSort(List<Integer> input, int start, int last, int position){
        for(int i=start; i<= last; i++) {
            for(int j=start; j<= last; j++){
                int iNo = findNumberAtPosition(input.get(i),position);
                int iNoNext = findNumberAtPosition(input.get(i),position+1);
                int jNo = findNumberAtPosition(input.get(j),position);
                int jNoNext = findNumberAtPosition(input.get(j),position+1);
                if(iNo != -1 && jNo != -1) {
                    if(iNo > jNo){
                        int temp = input.get(i);
                        input.set(i,input.get(j));
                        input.set(j,temp);
                    } else if(iNo == jNo && (iNoNext == -1 && jNoNext != -1)) {
                        int temp = input.get(i);
                        input.set(i,input.get(j));
                        input.set(j,temp);
                    }
                }

            }
        }

        int lowest = findNumberAtPosition(input.get(last),position);
        for(int i=start; i < last -1  ; i++) {
            int current  = findNumberAtPosition(input.get(i),position);
            int next = findNumberAtPosition(input.get(i+1),position);
            if(current != next) {
                specialSort(input,start,i, position + 1);
                start = i+1;
            }
            if(current == lowest) {
                specialSort(input,start,last, position + 1);
                break;
            }
        }
    }

    public int findNumberAtPosition(Integer number, int position){
        String convertedNumber = number.toString();
        if(convertedNumber.length() - 1 >= position){
            int result =Integer.parseInt(convertedNumber.substring(0,position+1));
            return result;
        } else {
            return -1;
        }
    }*/
}

