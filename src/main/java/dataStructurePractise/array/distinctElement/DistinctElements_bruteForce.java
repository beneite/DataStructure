/**
 *  Brute force approach
 */
package dataStructurePractise.array.distinctElement;

import java.util.ArrayList;

public class DistinctElements_bruteForce {

    public static ArrayList<Integer> returnDistinctElements(int[] arr){

        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(arrayList.contains(arr[i])){
                        break;
                    }else {
                        arrayList.add(arr[i]);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args){

        int[] arr={5,10,5,4,5,10};
        System.out.println(returnDistinctElements(arr));
    }
}
