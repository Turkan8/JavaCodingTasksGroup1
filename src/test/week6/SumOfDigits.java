package test.week6;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers("ISa 23456"));
    }
    public static String sumOfNumbers(String word){
        int sum = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (Character.isDigit(word.charAt(i))){
                sum += Integer.parseInt(""+word.charAt(i));
            }
        }
        return String.valueOf(sum);
    }
}
