package test.week2;

public class Numbers_ConsecutiveNumbers {

    public static void main(String[] args) {
        int n = 60;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print("Codility");
            }if(i % 3 == 0){
                System.out.print("Test");
            }if(i % 5 == 0){
                System.out.print("Coders");
            }if(i % 2 !=0 && i % 3 != 0 && i % 5 != 0){
                System.out.print(i);

            }
            System.out.println();
        }

    }
}
