package test.week1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        // write a method that can divide two numbers without using division operator
        int x,y;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        x = input.nextInt();

        System.out.println("Enter your second number");
        y = input.nextInt();

        int z =0;


        while (x >= y) {

            x = x - y;
            z++;
        }
        System.out.println("The result is " + z);
        System.out.println("The remainder is " + x);

    }

}

