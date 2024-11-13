/**
 * https://leetcode.com/problems/single-number/description/
 */
package dataStructurePractise.array.distinctElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {

    @DataProvider(name = "getArray")
    public Object[][] getData() {
        return new Object[][]
                {
                        {2, 2, 1},
                        {4, 1, 2, 1, 2},
                        {1}
                };
    }

    public static int findNumberAppearingOnce(int[] nums) {
        Integer keyToReturn = null;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(maps.containsKey(nums[i])){
                maps.put(nums[i], maps.get(nums[i])+1);
            }else{
                maps.put(nums[i], 1);
            }
        }


        return maps.entrySet()
                .stream()
                .filter(k -> k.getValue() == 1)
                .map(k -> k.getKey())
                .findFirst()
                .orElse(null);
    }

    @Test(dataProvider = "getArray")
    public void findNumberAppearingOnceTest(int[] arr){
        System.out.println(findNumberAppearingOnce(arr));
    }
}
