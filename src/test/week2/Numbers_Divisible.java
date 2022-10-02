package test.week2;

public class Numbers_Divisible {
    public static void main(String[] args) {
        String divisibelBy15 = "DivisibelBy15 ";
        String divisibelBy5 = "DivisibelBy5 ";
        String divisibelBy3 = "DivisibelBy3 ";
        for (int i = 1; i <=100 ; i++) {
            if (i%15==0){
                divisibelBy15 += i +" ";
            } else if (i%5==0) {
                divisibelBy5 += i +" ";
            } else if (i%3==0) {
                divisibelBy3 += i +" ";
            }
        }
        System.out.println(divisibelBy15);
        System.out.println(divisibelBy5);
        System.out.println(divisibelBy3);
    }

}
