/**
 * 268. https://leetcode.com/problems/missing-number/
 */
package leetcode.problems.topics.arrays.missing_number.arraySumApproach;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ArraySumApproach {

    @DataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][]
                {
                        {new int[]{1, 0 , 3}},
                        {new int[]{0,1}},
                        {new int[]{9,6,4,2,3,5,7,0,1}}
                };
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testMethod(int[] arr) {
        System.out.println(missingNumberLogic(arr));
    }

    public static int missingNumberLogic(int[] nums){

        int actualSum=0, expectedSum;
        int len = nums.length;

        expectedSum = len * (len +1)/2;

        for(int num : nums){
            actualSum+=num;
        }

        return expectedSum-actualSum;
    }
}
