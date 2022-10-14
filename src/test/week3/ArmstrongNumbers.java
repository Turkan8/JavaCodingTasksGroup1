package test.week3;

public class ArmstrongNumbers {

        public static void main(String[] args) {
            System.out.println(isArmStrongNumber(153)); // example armstrong number 153 . 1*1*1+5*5*5+3*3*3

        }

        public static boolean isArmStrongNumber(int number) {

            int result = 0;
            int length = ("" + number).length();
            int digit = 0;
            int holderNumber = number;
            for (int i = 0; i < length; i++) {
                digit = number % 10;
                result += Math.pow(digit, length);
                number = number / 10;
            }

            if (result == holderNumber) {
                return true;
            }
            return false;
        }
    }

