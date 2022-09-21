package test.week1;

public class Finra {
    public static void main(String[] args) {

        Finra printFinra = new Finra();
        printFinra.finra();
    }

    public void finra(){
        for (int i = 1; i <=30 ; i++) {

            if (i%15==0){
                System.out.println("FINRA");
            } else if (i%5==0) {
                System.out.println("RA");
            } else if (i%3==0) {
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
    }
}
