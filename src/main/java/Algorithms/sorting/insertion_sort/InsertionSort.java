package Algorithms.sorting.insertion_sort;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InsertionSort {


    @DataProvider(name = "unsortedArrayProvider")
    public Object[][] returnData() {
        return new Object[][]
                {
                        {3, 2, 1, 4},
                        {2, 3, 1, 5, 7, 8, 9, 10, 4, 6},
                        {5, 7, 8, 9, 10, 4, 6},
                        {-2, 2, 3, 1, 5, 7, 8, 9, 10, 4, -6, 0}
                };
    }

    @Test(dataProvider = "unsortedArrayProvider")
    public void insertionSortAlgorithmTest(int[] arr) {
        int len = arr.length;
        int key, i, j;
        for (i = 1; i < len ; i++) {
            key = arr[i];
            j = i-1;
            // shifting logic
            while (j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j--;
            }
            // placing the key
            arr[j+1] = key;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println("Array after sorting:"+ Arrays.toString(arr));
    }

}
