package test.week4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SameLetters {
    public static void main(String[] args) {
        same("isaam","misaa");
    }
    public static void same(String word1, String word2){
        List<String >first = new ArrayList<>(Arrays.asList(word1.split("")));
        List<String >second = new ArrayList<>(Arrays.asList(word2.split("")));

        System.out.println(first.stream().sorted().collect(Collectors.toList()).equals(second.stream().sorted().collect(Collectors.toList())));


    }
}
