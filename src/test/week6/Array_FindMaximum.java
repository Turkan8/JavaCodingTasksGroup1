package test.week6;

import java.util.Arrays;

public class Array_FindMaximum {

    public static void main(String[] args) {
        Integer[] numbers = {4,2,8,1,6};
        System.out.println("Maximum Number :" + findMaximum(numbers));

    }
    public static int findMaximum(Integer[] number){
        Arrays.sort(number);
        return number[number.length-1];

    }
}

