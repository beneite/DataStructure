/** Problem no: 136
 * https://leetcode.com/problems/single-number/description/
 */
package leetcode.problems.topics.arrays.singlenumber;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SecondSolution {

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData(){
        return new Object[][] {{2,2,1},{4,1,2,1,2},{1}};
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                int value = hashMap.get(nums[i])+1;
                hashMap.put(nums[i],value);
            }else {
                hashMap.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue()==1)
                return entry.getKey();
        }

        return -1;
    }

    @Test(dataProvider = "arrayData")
    public void printNonRepeating(int[] arr){
        System.out.println("Target Number:"+ singleNumber(arr));
    }
}
