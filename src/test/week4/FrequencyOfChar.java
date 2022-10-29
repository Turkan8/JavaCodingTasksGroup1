package test.week4;

public class FrequencyOfChar {

    public static void main(String[] args) {
        System.out.println(frequencyChars("AAAABBBCCAAADD"));

    }
    public static String frequencyChars(String word){
        String frequency = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            for (int j = i+1; j <word.length() ; j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (!frequency.contains(""+word.charAt(i))){
                frequency +=""+ word.charAt(i)+count;
            }



        }
        return frequency;

    }
}

