/**
 *   https://leetcode.com/problems/reverse-words-in-a-string/
 */
package dataStructurePractise.string.stringRearrangement;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void reverseWords(String s){
        s=s.trim();
        String[] str=s.split(" ");
    }

    public static String stringReverse(String s){
        s=s.trim();
        char[] str=s.toCharArray();
        int front=0, back=s.length()-1;
        char temp;
        while(front<back){
            temp=str[front];
            str[front]=str[back];
            str[back]=temp;
            front++;
            back--;
        }
        s= Arrays.toString(str);
        return s;
    }

    public static void main(String[] args){

    }
}
