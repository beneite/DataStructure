package dataStructurePractise.binarySearch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class findFirstAndLastOccurenceInSortedArray {

    @DataProvider(name = "returnArray")
    public Object[][] returnDataSet() {
        return new Object[][]
                {
                        {new int[]{0, 1, 1, 2, 3, 4, 8}, 1, true},
                        {new int[]{0, 0, 1, 3, 3, 3, 3, 4, 4, 8}, 3, false},
                };
    }

    public static int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int last = nums.length - 1;
        int targetIndex = -1;

        while(start <= last){
            int mid = start + (last-start)/2;

            if(nums[mid] == target){
                targetIndex = mid;
                if (isFirst)
                    last = mid -1;
                else
                    start = mid +1;
            }
            else if(nums[mid] > target){
                last = mid -1;
            }else {
                start = mid +1;
            }
        }
        return targetIndex;
    }

    @Test(dataProvider = "returnArray")
    public void bsTestMethod(int[] arr, int target, boolean isFirst){
        System.out.println(search(arr, target, isFirst));
    }

}
