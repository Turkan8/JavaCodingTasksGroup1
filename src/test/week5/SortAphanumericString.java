package test.week5;

import java.util.Arrays;
import java.util.List;

public class SortAphanumericString {

    public static void main(String[] args) {
        System.out.println(sort("DC501GCCCA098911"));
    }
    public static String sort(String word){

        String result = "";
        List<String> words;
        for (int i = 0; i < word.length()-1; i++) {
            result += word.charAt(i);
            if (Character.isDigit(word.charAt(i)) && Character.isLetter(word.charAt(i+1))){
                result += ",";
            }
            if (Character.isDigit(word.charAt(i+1)) && Character.isLetter(word.charAt(i))){
                result += ",";
            }
        }
        result += word.charAt(word.length()-1);
        words = Arrays.asList(result.split(","));
        result = "";
        for (String each : words) {
            String[] chara = each.split("");
            Arrays.sort(chara);
            for (String eachChar : chara) {
                result +=eachChar;
            }
        }
        return result;
    }
}

