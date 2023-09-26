/**
 * https://leetcode.com/problems/reverse-string/description/ -> Question no: 344
 */

package dataStructurePractise.string.stringRearrangement;

import java.util.Arrays;

public class ReverseTheString {

    public static char[] reverseString(char[] s) {

        char temp;
        int secondPointer=s.length-1;
        int firstPointer=0;
        while(firstPointer<secondPointer)
        {
            temp=s[firstPointer];
            s[firstPointer]=s[secondPointer];
            s[secondPointer]=temp;
            firstPointer++;
            secondPointer--;
        }
        return s;
    }

    public static void main(String[] args){


        char[] s={'o','h'};
        System.out.println(Arrays.toString(reverseString(s)));

    }
}
