package test.week7;

import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {
        Integer[] numbers = {4,2,8,1,6};
        System.out.println("Maximum Number :" + findMinimum(numbers));

    }
    public static int findMinimum(Integer[] number){
        Arrays.sort(number);
        return number[0];

    }
}
