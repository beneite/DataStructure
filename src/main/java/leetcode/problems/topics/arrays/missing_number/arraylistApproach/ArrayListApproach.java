/**
 * 268. https://leetcode.com/problems/missing-number/
 */
package leetcode.problems.topics.arrays.missing_number.arraylistApproach;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApproach {

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

    public static int missingNumberLogic(int[] arr){
        int n = arr.length;
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            numberList.add(i);
        }

        for (int num : arr) {
            numberList.remove(Integer.valueOf(num));
        }

        return numberList.get(0);
    }

}
