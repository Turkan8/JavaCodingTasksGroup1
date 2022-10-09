package test.week1;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your number ");
        int Number = input.nextInt();

        if (Number % 2 == 0) {
            System.out.println(Number + " is even ");
        }
        if (Number % 2 == 1) {
            System.out.println(Number + " is odd");
        }
    }
}





