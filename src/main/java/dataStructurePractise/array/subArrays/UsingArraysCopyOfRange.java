package dataStructurePractise.array.subArrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingArraysCopyOfRange {


    @DataProvider(name="dataProviderName")
    public Object[][] dataProviderMethod(){
        return new Object[][]
                {
                        {1,2,3,4}
                };
    }

    @Test(dataProvider = "dataProviderName")
    public void printAllSubArrays(int[] arr){
        ArrayList<List<Integer>> listOfArrayList = returnAllSubArrays(arr);
        listOfArrayList.stream().forEach(e -> System.out.println(e));
    }

    public static ArrayList<List<Integer>> returnAllSubArrays(int[] arr){
        List<Integer> arrayList = null;
        ArrayList<List<Integer>> listOfArrayList = new ArrayList<>();
        int n = arr.length;
        for(int start=0; start<n; start++){
            for(int end=start; end<n; end++){
                arrayList = new ArrayList<>();
                int[] subArray = Arrays.copyOfRange(arr, start, end+1);
                for(int ele : subArray){
                    arrayList.add(ele);
                }
                listOfArrayList.add(arrayList);
            }
        }
        return listOfArrayList;
    }
}
