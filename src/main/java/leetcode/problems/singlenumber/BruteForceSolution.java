/** Problem no: 136
 * https://leetcode.com/problems/single-number/description/
 */
package leetcode.problems.singlenumber;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class BruteForceSolution {

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData(){
        return new Object[][] {{2,2,1},{4,1,2,1,2},{1}};
    }

    public static int singleNumber(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count!=2)
                return nums[i];
        }
        return -1;
    }

    @Test(dataProvider = "arrayData")
    public void printNonRepeating(int[] arr){
        System.out.println("Target Number:"+ singleNumber(arr));
    }
}
