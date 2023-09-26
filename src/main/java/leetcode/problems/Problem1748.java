package leetcode.problems;

import java.util.HashMap;

public class Problem1748 {

    public static int returnSumOfNonRepeating(int[] arr){

        HashMap<Integer, Integer> map=returnHashMapFromArray(arr);
        int sum=0;
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static HashMap<Integer,Integer> returnHashMapFromArray(int[] arr){

        HashMap<Integer,Integer> map= new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args){

        int[] arr={1,1,1,1,1};
        System.out.println(returnSumOfNonRepeating(arr));
    }
}
