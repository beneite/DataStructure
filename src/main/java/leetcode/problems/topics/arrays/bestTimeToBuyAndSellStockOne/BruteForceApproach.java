/** no: 121
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
package leetcode.problems.topics.arrays.bestTimeToBuyAndSellStockOne;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BruteForceApproach {

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData() {
        return new Object[][]{
                {7,1,5,3,6,4}, {7,6,4,3,1}, {2,2,1}
        };
    }

    public static int bestTimeToBuy(int[] nums) {
        int maxProfit = 0;
        int allProfits =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                allProfits = nums[j]-nums[i];
                if(allProfits>maxProfit && allProfits>0){
                    maxProfit = allProfits;
                }
            }
        }
        return maxProfit;
    }

    @Test(dataProvider = "arrayData")
    public void testMethod(int[] arr) {
        System.out.println("Max Profit Amount:" + bestTimeToBuy(arr));
    }
}
