package test.week7;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        Integer[] number = {1,2,1,5,3,8,9,1,12};
        System.out.println(Arrays.toString(ascendingSort(number)));
    }
    public static Integer[] ascendingSort(Integer[] number){
        for (int i = 0; i <number.length ; i++) {
            for (int j = i+1 ; j <number.length ; j++) {
                if (number[i]>number[j]){
                    int holder = number[i];
                    number[i]=number[j];
                    number[j]=holder;
                }
            }
        }
        return number;
    }
}
