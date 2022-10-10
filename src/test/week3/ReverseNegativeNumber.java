package test.week3;

import java.util.Collections;
import java.util.Map;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverse(-98));

    }
    public static int reverse(int number){
        number = Math.abs(number);
        String nums = "-";
        int length = (""+number).length();

        for (int i = 0; i <length ; i++) {
            nums += number%10;
            number = number/10;
        }
        int reversed = Integer.parseInt(nums);
        return reversed;
    }


}
