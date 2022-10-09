package test.week1;

public class NumbersDivideWithoutOperator {
    public static void main(String[] args) {

        divide(11,3);
        System.out.println(divide(11,3));


    }
    public static int divide(int num1, int num2){
        int count = 0;
        for(int i = num2; i <= num1; i = i + num2){
            count ++;

        }
        return  count;
    }
}
