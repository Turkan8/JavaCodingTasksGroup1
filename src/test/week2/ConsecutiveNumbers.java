package test.week2;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        codilityTestCoders(num);
    }

    public static void codilityTestCoders(int num) {

        for (int i = 1; i < num; i++) {
            if (i % 2 == 0)
                System.out.print("Codility");
            if (i % 3 == 0)
                System.out.print("Test");
            if (i % 5 == 0)
                System.out.print("Coders");
            if(i%2!=0 && i%3!=0 && i%5!=0)
                System.out.print(i);
            System.out.println();
        }
    }
}
