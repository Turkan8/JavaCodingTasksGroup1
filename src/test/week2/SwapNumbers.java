package test.week2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The numbers are " + a + " and " + b );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap the numbers are " + a + " and " + b);











    }
}
