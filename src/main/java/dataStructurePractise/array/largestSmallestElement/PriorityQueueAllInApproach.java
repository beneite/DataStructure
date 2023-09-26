package dataStructurePractise.array.largestSmallestElement;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueAllInApproach {

    public static int kThLargestElement(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); // Java implements min heap by default.
        for(int a:arr){
            pq.add(a);
        }

        while(k>1){
            pq.poll();
            k--;
        }

        return pq.peek();
    }

    public static void main(String[] args){
        int[] arr= {2,1,5,4,3,7,8};
        System.out.println(kThLargestElement(arr,7));
    }
}
