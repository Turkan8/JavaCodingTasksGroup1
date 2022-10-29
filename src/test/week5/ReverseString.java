package test.week5;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("chernenko"));
    }
    public static String reverse(String word){

        String holder = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            holder+=word.charAt(i);
        }
        return holder;
    }
}

