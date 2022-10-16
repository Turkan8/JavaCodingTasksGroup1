package test.week4;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDublicates {

    public static void main(String[] args) {
        System.out.println( removeDub("AAABBBCCC"));
    }
    public static String removeDub(String word){
        String holder = "";
        Set<String>unique = new LinkedHashSet<>(Arrays.asList(word.split("")));
        for (String each : unique) {
            holder += each;
        }
        return holder;



    }
}
