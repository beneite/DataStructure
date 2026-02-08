/**
 * https://leetcode.com/problems/valid-anagram/description/
 */
package leetcode.problems.topics.hashmaps;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class AnagramQuestion {

    @DataProvider(name = "anagramTestData")
    public Object[][] returnDataSet() {

        return new Object[][]{
                {"anagram", "nagaram"},
                {"rat", "car"}
        };
    }

    @Test(dataProvider = "anagramTestData")
    public void testAnagram(String s, String t) {
        System.out.println(s+" / "+t+ " :"+ isAnagram(s.toLowerCase(), t.toLowerCase()));
    }


    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sCharacterMap = returnCharacterCountMap(s);
        Map<Character, Integer> tCharacterMap = returnCharacterCountMap(t);

        return sCharacterMap.equals(tCharacterMap);
    }

    public static Map<Character, Integer> returnCharacterCountMap(String s){
        Map<Character, Integer> sCharacterMap = new HashMap<>();
        char[] charArr = s.toCharArray();

        for(char ch : charArr){
            sCharacterMap.put(ch, sCharacterMap.getOrDefault(ch, 0)+1);
        }

        return sCharacterMap;
    }

}
