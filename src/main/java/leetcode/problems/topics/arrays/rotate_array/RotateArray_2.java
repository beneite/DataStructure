package leetcode.problems.topics.arrays.rotate_array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateArray_2 {

    /**
     * https://leetcode.com/problems/rotate-array/description/ : 189. Rotate Array
     */

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 5},
                {new int[]{1,2,3,4,5,6,7}, 3},
                {new int[]{-1,-100,3,99}, 2}
        };
    }

    public static int[] logic(int[] nums, int k) {

        return new int[]{};
    }

    @Test(dataProvider = "arrayData")
    public void checkIfArrayIsSortedAndRotatedTest(int[] nums, int k) {
        System.out.println("Original Array:" + Arrays.stream(nums).boxed().toList() + ", Rotate by:" + k + ", result:" + Arrays.stream(logic(nums, k)).boxed().toList());
    }
}
