/**
 * https://leetcode.com/problems/two-sum
 */
package leetcode.problems.topics.arrays.two_sum;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapApproach {

    @DataProvider(name = "dataProviderName")
    public Object[][] dataProvider(){
        return new Object[][]{
                { new int[] {2,7,11,15}, 9 },
                { new int[] {3,2,4}, 6 },
                { new int[] {3,3}, 6 }
        };
    }

    @Test(dataProvider = "dataProviderName")
    public void testMethod(int[] nums, int target){
        System.out.println(Arrays.toString(findIndexLogic(nums, target)));
    }

    public static int[] findIndexLogic(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
