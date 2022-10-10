package test.week3;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(371));

    }
    public static boolean isArmStrongNumber(int number){

        int result = 0;
        int length = (""+number).length();
        int digit = 0;
        int holderNumber = number;
        for (int i = 0; i <length ; i++) {
            digit = number%10;
            result += Math.pow(digit,length);
            number = number/10;
        }

        if (result==holderNumber){
            return true;
        }
        return  false;
    }
}
