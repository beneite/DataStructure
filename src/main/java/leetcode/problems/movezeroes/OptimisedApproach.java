/** Problem no: 283
 * https://leetcode.com/problems/move-zeroes/description/
 */
package leetcode.problems.movezeroes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OptimisedApproach {

    @DataProvider(name = "arrayData")
    public Object[][] provideTestData(){
        return new Object[][] {{0,1,0,3,12},{0,1,0,3,0},{0,1,0}};
    }

    public static int[] moveZeroes(int[] nums) {
        int countZero = 0;
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }else{
                countZero++;
            }
        }
        for(int i=0;i<countZero;i++){
            nums[nums.length-1-i]=0;
        }
        return nums;
    }

    @Test(dataProvider = "arrayData")
    public void printArrayAfterMoverZeros(int[] arr){
        System.out.println("Old Array:"+Arrays.toString(arr));
        System.out.println("New Array:"+Arrays.toString(moveZeroes(arr)));
    }
}
