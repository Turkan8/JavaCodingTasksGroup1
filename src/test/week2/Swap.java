package test.week2;

public class Swap {
    public static void main(String[] args) {

        Swap.swap(3,10);

    }
    public static void swap(int a,int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
