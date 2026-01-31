package dataStructurePractise.binarySearch;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CeilOfANumber {

    @DataProvider(name = "returnArray")
    public Object[][] returnDataSet() {
        return new Object[][]
                {       // {int[] arr, target, expectedCeil}
                        {new int[]{0, 1, 1, 2, 3, 4, 8}, 3, 3},
                        {new int[]{0, 0, 1, 3, 3, 3, 3, 4, 4, 8}, 4, 4},
                        {new int[]{0, 1, 2, 3, 4, 5, 7, 7}, 6, 7},
                        {new int[]{0, 1, 2, 3, 4, 5, 7, 8}, 8, 8},
                        {new int[]{0, 2, 2, 3, 4, 5, 7, 8}, 2, 2},
                        {new int[]{1, 1, 1, 3, 4, 5, 7, 8, 9, 10}, 2, 3},
                };
    }

    @Test(dataProvider = "returnArray")
    public void testMethod(int[] arr, int target, int expectedCeil) {
        int actualCeil = findCeil(arr, target);
        System.out.println("target: " + target + "; actualCeil:" + actualCeil + "; expectedCeil:" + expectedCeil);
        Assert.assertEquals(actualCeil, expectedCeil);
    }

    public static int findCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ceilNumber = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ceilNumber = arr[mid];
                break;
            } else if (arr[mid] > target) {
                ceilNumber = arr[mid];
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return ceilNumber;
    }
}
