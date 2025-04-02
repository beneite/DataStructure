package leetcode.problems.topics.arrays.check_if_array_is_sorted_and_rotated;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class checkIfArrayIsSortedAndRotated_01 {

    /**
     * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/ : 1752. Check if Array Is Sorted and Rotated
     */

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {new int[]{3, 4, 5, 6, 7}, true},
                {new int[]{3, 4, 5, 1, 2}, true},
                {new int[]{3, 4, 5, 1, 7}, false},
                {new int[]{1, 2, 3},       true},
                {new int[]{2, 1, 3, 4},    false}
        };
    }

    public static boolean logic(int[] nums) {

        boolean flag = false;
        int count = 0;

        for (int i = 0; i  < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                count++;
        }
        if (nums[nums.length - 1] > nums[0])
            count++;

        return count <= 1;
    }

    @Test(dataProvider = "arrayData")
    public void checkIfArrayIsSortedAndRotatedTest(int[] nums, boolean flag) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(list + ":" + logic(nums));
        Assert.assertEquals(logic(nums), flag);
    }
}
