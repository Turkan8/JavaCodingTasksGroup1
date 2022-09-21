package test.week1;

public class Numbers {
    public static void main(String[] args) {
        Numbers  a = new Numbers();
        System.out.println(a.divide(12, 2));
    }
    public int divide(int num1,int num2) {

        int count = 0;
        for (int i = num2; i <= num1; i = i + num2) {
            count++;
        }
        return count;
    }
}
