package dataStructurePractise.binarySearch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleBinarySearch {

    @DataProvider(name = "returnArray")
    public Object[][] returnDataSet(){
        return new Object[][]
                {
                        {new int[]{0,1,2,3,4,8}, 1},
                        {new int[]{0,0,1,2,4,8}, 3},
                };
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int last = nums.length;
        int designatedIndex = -1;

        while (start <= last){
            int mid = start + (last - start)/2;         // using this to avoid 32-bit signed integer

            if(nums[mid] == target) {
                designatedIndex =  mid;
                break;
            }
            else if(nums[mid] > target){
                last = mid -1;
            }else
                start = mid +1;
        }
        return designatedIndex;
    }

    @Test(dataProvider = "returnArray")
    public void bsTestMethod(int[] arr, int target){
        System.out.println(search(arr, target));
    }
}
