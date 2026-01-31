package dataStructurePractise.binarySearch;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FloorOfANumber {

    @DataProvider(name = "returnArray")
    public Object[][] returnDataSet() {
        return new Object[][]
                {       // {int[] arr, target, expectedFloor}
                        {new int[]{0, 1, 1, 2, 3, 4, 8}, 3, 3},
                        {new int[]{0, 0, 1, 3, 3, 3, 3, 4, 4, 8}, 4, 4},
                        {new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 6, 6},
                        {new int[]{0, 1, 2, 3, 4, 5, 7, 8}, 6, 5},
                        {new int[]{0, 2, 2, 3, 4, 5, 7, 8}, 1, 0},
                        {new int[]{2, 2, 2, 3, 4, 5, 7, 8}, 1, -1},
                };
    }

    @Test(dataProvider = "returnArray")
    public void testMethod(int[] arr, int target, int expectedFloor) {
        int actualFloor = findFloor(arr, target);
        System.out.println("target: "+target+"; actualFloor:"+actualFloor+"; expectedFloor:"+expectedFloor);
        Assert.assertEquals(actualFloor, expectedFloor);
    }

    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int floorNumber = -1;

        while(start <= end){
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                floorNumber = arr[mid];
                break;
            }else if(arr[mid] < target){
                floorNumber = arr[mid];
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return floorNumber;
    }

}
