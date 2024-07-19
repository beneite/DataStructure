/**
 * 2124. Check if All A's Appears Before All B's
 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 */
package leetcode.problems.topics.string.Check_if_All_A_Appears_Before_All_B;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubStringApproach {

    @DataProvider(name = "testDataSet-1")
    public Object[][] testDataProvider() {
        return new Object[][]{
                {"aaabbb", true}, {"abab", false}, {"bbb", true}, {"bababa", false}, {"aabbbbbbba", false}
        };
    }

    @Test(dataProvider = "testDataSet-1")
    public void driverMethod(String data, boolean flag) {
        Assert.assertEquals(flag, checkString(data), "Failed for "+data);
    }

    public static boolean checkString(String s) {
        return !s.contains("ba");
    }
}
