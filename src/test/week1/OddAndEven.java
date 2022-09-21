package test.week1;

public class OddAndEven {
    public static void main(String[] args) {
        OddAndEven num = new OddAndEven();
        num.identify(5);
    }

    public void identify(int num){
        if (num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
