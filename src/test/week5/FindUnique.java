package test.week5;

public class FindUnique {
    public static void main(String[] args) {

        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }
    public static String uniqueChars(String word){
        for (int i = 0; i <word.length() ; i++) {
            for (int j = i+1; j <word.length() ; j++) {
                if (word.charAt(i)==word.charAt(j)){
                   word= word.replaceAll(""+word.charAt(i),"");
                }
            }
        }
        return word;
    }
}
