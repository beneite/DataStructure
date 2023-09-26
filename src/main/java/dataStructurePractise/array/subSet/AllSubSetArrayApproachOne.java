/**
 *  Java program to find all the subsets of an array using iterative approach...
 *  [1,2,3]=> [], [1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]
 *  https://www.youtube.com/watch?v=kYY9DotIKlo&ab_channel=PrakashShukla
 */
package dataStructurePractise.array.subSet;

import java.util.ArrayList;
import java.util.List;

public class AllSubSetArrayApproachOne {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> master=new ArrayList<>();
        master.add(new ArrayList());

        for(int i:nums){
            int n=master.size();
            for(int j=0;j<n;j++){
                List<Integer> temp=new ArrayList(master.get(j));
                temp.add(i);
                master.add(temp);
            }
        }

        return master;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(subsets(arr));
    }
}
