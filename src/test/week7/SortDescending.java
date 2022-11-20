package test.week7;
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] nums = {1,6,2,9,1,5,2,12,7};
        System.out.println(Arrays.toString(descendingSort(nums)));
    }
    public static Integer[] descendingSort(Integer[] number){
        for (int i = 0; i <number.length ; i++) {
            for (int j = i+1; j <number.length ; j++) {
                if (number[i]<number[j]){
                    int holder = number[i];
                    number[i]=number[j];
                    number[j]=holder;
                }
            }
        }
        return number;
    }
}
