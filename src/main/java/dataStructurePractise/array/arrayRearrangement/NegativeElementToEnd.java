/**
 *  https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
 */
package dataStructurePractise.array.arrayRearrangement;

import java.util.Arrays;

public class NegativeElementToEnd {

    public static int[] returnArray(int[] arr){
        int[] a=new int[arr.length];
        int j=0;
        for(int i:arr){
            if(i>=0){
                a[j]=i;
                j++;
            }
        }

        for(int i:arr){
            if(i<0){
                a[j]=i;
                j++;
            }
        }

        return a;
    }

    public static void main(String args[]){
        int[] arr={1, -1, 3, 2, -7, -5, 11, 6 };
        System.out.println(Arrays.toString(returnArray(arr)));
    }
}
