package test.week3;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {

        System.out.println(reverse(-981));

    }
    public static int reverse(int number){
        number = Math.abs(number);
        String nums = "-";
        int length = (""+number).length();

        for (int i = 0; i < length ; i++) {
            nums += number%10;
            number = number/10;
        }
        int reversed = Integer.parseInt(nums);
        return reversed;
    }
}
