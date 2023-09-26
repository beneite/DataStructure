package dataStructurePractise.array.arrayRearrangement;

import java.util.Arrays;

public class Problem1389 {

    public static int[] createTargetArray(int[] nums, int[] index){

        int[] targetArr=new int[index.length];
        for(int i=0;i<nums.length;i++){
            targetArr=shiftRightFromEnd(targetArr,index[i]);
            targetArr[i]=nums[i];
            System.out.println(Arrays.toString(targetArr));
        }

        return targetArr;
    }

    public static int[] shiftRightFromEnd(int[] arr, int index){

        int stopPtr=index;
        int currPtr=arr.length-2;
        //int temp;
        while(currPtr>=stopPtr){
            arr[currPtr+1]=arr[currPtr];
            currPtr--;
        }
        return arr;
    }


    public static void main(String[] args){

        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        int[] targetArray=createTargetArray(nums,index);

        //System.out.println(Arrays.toString(targetArray));
    }
}
