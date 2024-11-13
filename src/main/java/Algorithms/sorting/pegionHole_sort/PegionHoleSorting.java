package Algorithms.sorting.pegionHole_sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PegionHoleSorting {


    public static void main(String[] args){

        int[] arr = {1,7,9,5,3,8,0};

        for(int i = 0; i < arr.length ; i++ ){
            for(int j = 0; j < arr.length-1-i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(e-> System.out.println(e));

    }
}
