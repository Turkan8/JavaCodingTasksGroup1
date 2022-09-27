package test.week1;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {
        //write a method that can identifies given number is even or odd

        // identify(5) --> odd
        // identify(6) --> even


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("even");
        } else  {
            System.out.println("odd");
        }

    }
}

