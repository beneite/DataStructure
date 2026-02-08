package leetcode.problems.topics.hashmaps;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharactersIndex {

    @DataProvider(name = "dataSetOne")
    public Object[][] returnTestData(){
        return new Object[][] {
                { "leetcode", 0 },
                { "loveleetcode", 2 },
                { "aabb", -1 }
        };
    }

    @Test(dataProvider = "dataSetOne")
    public void testMethod(String str , int expectedValue){
        int actualValue = firstUniqChar(str);
        System.out.println(actualValue);

//        Assert.assertEquals(actualValue, expectedValue);
    }

    public static int firstUniqChar(String s){
        Character firstNonRepeatingChar = null;
        int firstNonRepeatingindex = -1;
        char[] charArray = s.toCharArray();

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for(char ch : charArray){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry:  charCountMap.entrySet()){
            if(entry.getValue() == 1){
                firstNonRepeatingChar = entry.getKey();
                 break;
            }
        }

        if(firstNonRepeatingChar != null){
            firstNonRepeatingindex = s.indexOf(firstNonRepeatingChar);
        }

        return firstNonRepeatingindex;
    }
}
