/**
 * this program shows how to sort an array using bubble sort
 */
package Algorithms.sorting.bubble_sort;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    @DataProvider(name = "supplyArrays")
    public Object[][] supplyArrays(){
        return new Object[][] {
                {3,2,1,4},
                {2,3,1,5,7,8,9,10,4,6},
                {5,7,8,9,10,4,6},
                {-2 ,2,3,1,5,7,8,9,10,4,-6,0}
        };
    }

    @Test(dataProvider = "supplyArrays")
    public void sortThisArrayInAscending(int[] arr){

        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by the inner loop, then break
            if (!swapped) {
                break;
            }
        }

        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println("Array after sorting:"+ Arrays.toString(arr));
    }
}
