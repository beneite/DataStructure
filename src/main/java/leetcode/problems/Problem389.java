/**
 *  https://leetcode.com/problems/find-the-difference/
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem389 {

    public static char findTheDifference(String s, String t) {
        List<Character> arrayList = new ArrayList<>();
        for(int i=0;i<t.length();i++){
            arrayList.add(t.charAt(i));
        }
        System.out.println(arrayList);

        for(int i=0;i<s.length();i++){
            arrayList.remove((Character) s.charAt(i));
        }

        return arrayList.get(0);
    }

    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));

    }
}
