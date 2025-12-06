package leetcode.problems.topics.string.Check_if_All_A_Appears_Before_All_B;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;


public class SubArrayWithOddSum {

    @DataProvider(name = "dataProviderName")
    public Object[][] dataProviderMethod() {
        return new Object[][]
                {
                        {new int[]{10, 0, 0, 5, 2, 7}, 5}
                };
    }

    @Test(dataProvider = "dataProviderName")
    public void printAllSubArrays(int[] arr, int target) {
        System.out.println(logicMethod(arr, target));
    }


    public static int logicMethod(int[] nums, int k) {
        int n = nums.length;
        int x = 0, count=0;
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(0, 1);
        for (int i = 0; i < n; i++) {
            x = x + nums[i];
            int rem = x - k;
            if (hashMap.containsKey(rem)) {
                count = count +hashMap.get(rem);
            }
            hashMap.put(x, hashMap.getOrDefault(x, 0)+1);
        }
        return count;
    }
}
