package leetcode.problems.topics.arrays.rotate_array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateArray_1 {

    /**
     * https://leetcode.com/problems/rotate-array/description/ : 189. Rotate Array
     */

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 5},
                {new int[]{1, 2, 3, 4, 5, 6, 7}, 3},
                {new int[]{-1, -100, 3, 99}, 2}
        };
    }

    public static int[] logic(int[] nums, int k) {

        int len = nums.length;
        k = k % len;
        reverseAnArray(nums, 0, len - 1);
        reverseAnArray(nums, 0, k-1);
        reverseAnArray(nums, k, len - 1);
        return nums;
    }

    public static void reverseAnArray(int[] nums, int startingIndex, int lastIndex) {
        int len = nums.length;
        while (startingIndex < lastIndex) {
            int temp = nums[startingIndex];
            nums[startingIndex] = nums[lastIndex];
            nums[lastIndex] = temp;
            startingIndex++;
            lastIndex--;
        }
    }

    @Test(dataProvider = "arrayData")
    public void checkIfArrayIsSortedAndRotatedTest(int[] nums, int k) {
        System.out.println("Original Array:" + Arrays.stream(nums).boxed().toList() + ", Rotate by:" + k + ", result:" + Arrays.stream(logic(nums, k)).boxed().toList());
    }
}
