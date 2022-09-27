package test.week1;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
/*
        FINRA :
        Write a method which prints out the numbers from 1 to 30 but for numbers which
        are a multiple of 3print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        both 3 and 5, print "FINRA" instead of the number.

        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = input.nextInt();


        if (30 <num || num<1){
            System.out.println("Your number should be between 1-30");


        }else if (num%15==0){
            System.out.println("FINRA");
        }else if (num%3==0){
            System.out.println("FIN");
        } else if (num%5==0) {
            System.out.println("RA");
        }else {
            System.out.println(num);
        }

    }
}
