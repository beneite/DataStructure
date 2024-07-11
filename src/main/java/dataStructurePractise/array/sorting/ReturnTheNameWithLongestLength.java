package dataStructurePractise.array.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * program to return the name with the longest length, we will implement priority queue
 */
class StringComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}
public class ReturnTheNameWithLongestLength {

    public static void main(String[] args){

        String[] names = {"A","DDDD","CCC","EEEE","BB","FFFFF"};

        PriorityQueue<String> pq = new PriorityQueue<>(new StringComparator());
        pq.addAll(Arrays.asList(names));

        System.out.println("longest name:"+pq.peek());
    }
}
