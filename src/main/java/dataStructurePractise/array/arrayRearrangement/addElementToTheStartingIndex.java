/**
 * program to move add a new element at the 0th index of an array
 */
package dataStructurePractise.array.arrayRearrangement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class addElementToTheStartingIndex {

    @DataProvider(name = "testdata")
    public Object[][] testData(){
        HashMap<Integer, int[]> map = new HashMap<>();

        return new Object[][] {
                {new int[]{1,2,3,4},4},
                {new int[]{1,2,3,4,5,6},0},
                {new int[]{2},1}
        };
    }

    public static int[] newArrayAfterAddition(int[] arr, int num){
        int[] newArr = new int[arr.length+1];
        newArr[0] = num;
        int i = 1;
        for(int j : arr){
            newArr[i] = j;
            i++;
        }
        return newArr;
    }

    @Test(dataProvider = "testdata")
    public void addElementToStartIndex(int[] arr, int num){
        Arrays.stream(newArrayAfterAddition(arr,num)).forEach(i -> System.out.println(i));
    }
}
