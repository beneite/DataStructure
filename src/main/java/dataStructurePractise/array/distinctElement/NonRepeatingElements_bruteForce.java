/*
 Program to print the Non-repeating elements in an array
 */
package dataStructurePractise.array.distinctElement;

import java.util.ArrayList;

public class NonRepeatingElements_bruteForce {

    public static ArrayList<Integer> findNonRepeatingElement(int[] arr){

        int count=0;
        ArrayList<Integer> arrayList= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                arrayList.add(arr[i]);
            }
            count=0;
        }
        return arrayList;
    }

    public static void main(String[] args){

        int[] arr={5,10,5,4,5,10};
        System.out.println(findNonRepeatingElement(arr));
    }
}
