package test.week2;

public class SwapNumbers {

    //In this approach, we use simple mathematics. We use any one variable from given two variables to store the sum of both variables.
    //
    //Once we have sum in one variable and second variable has original value, we can use these both to get values swapped.

    public static void main(String[] args) {
        swap(10, 2);

    }

    public static void swap(int a, int b){
        a = a + b; // a = 12
        b = a - b; // b = 10
        a = a - b; // a = 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Java program which uses temporary variable 'temp' to swap two numbers.

        //Assign value of 'x' to 'temp'.
        //Assign value of 'y' to 'x'.
        //Assign value of 'temp' to 'y'.
        //After above steps, value of 'x' will be assigned to 'y' and value of 'y' will be assigned to 'x'.


        int temp;
        int x = 3;
        int y = 6;

        //Swapping in steps
        temp = x;
        x = y;
        y = temp;

        //Verify swapped values
        System.out.println("x = " + x + " and y = " + y);
    }
}




