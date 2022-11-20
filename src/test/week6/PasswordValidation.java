package test.week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordCheck("Aa    !"));
    }
    public static boolean passwordCheck(String word){
        if (word.contains(" ")){
            return false;
        }
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();

    }
}
