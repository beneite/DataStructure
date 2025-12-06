package leetcode.problems.topics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindTheCharacterInWord {

    @DataProvider(name = "dataProviderName")
    public Object[][] dataProviderMethod() {
        return new Object[][]
                {
                        {1}
                };
    }

    @Test(dataProvider = "dataProviderName")
    public void printAllSubArrays(int[] arr) {
        System.out.println(returnMaxSumSubArrays(arr));
    }

    public static int returnMaxSumSubArrays(int[] nums) {
        int n = nums.length;
        int sum = 0, max = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                sum = 0;
                for (int index = start; index <= end; index++) {
                    sum += nums[index];
                }
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
