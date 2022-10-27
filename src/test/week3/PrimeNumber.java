package test.week3;

public class PrimeNumber { // check if number is prime or not
    public static void main(String[] args) {
        System.out.println(isPrime(27));
    }
    public static boolean isPrime(int num){
        if (num==1){
            return false;
        }
        for (int i = 2; i <num ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}

