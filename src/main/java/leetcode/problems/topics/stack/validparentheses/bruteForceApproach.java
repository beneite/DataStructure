/**
 * no: 20
 * https://leetcode.com/problems/valid-parentheses/
 */
package leetcode.problems.topics.stack.validparentheses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Stack;

public class bruteForceApproach {

    @DataProvider(name = "bracketsString")
    public Object[][] testData() {
        return new Object[][]{
                {"()"}, {"[]"}, {"{}"}, {"(]"}, {"[]()}"}, {"[{()}]"}, {"[{()}]{[}]"}
        };
    }

    public static boolean returnIfBracketsAreBalanced(String str) {
        int n = str.length();
        if (n % 2 != 0) {
            return false;       // if length is odd it means that the parentheses are already not closed, hence returning false
        }

        Stack<Character> characterStack = new Stack<>();
        for (char character : str.toCharArray()) {
            switch (character) {
                case '(', '[', '{' -> characterStack.push(character);
                case ')' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '(') return false;
                }
                case '}' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '{') return false;
                }
                case ']' -> {
                    if (characterStack.isEmpty() || characterStack.pop() != '[') return false;
                }
            }
        }

        return characterStack.isEmpty();
    }

    @Test(dataProvider = "bracketsString")
    public void testValidParentheses(String str) {
        if (returnIfBracketsAreBalanced(str)) {
            System.out.println(str + ": is VALID ✅");
        } else {
            System.out.println(str + ": is INVALID ❌");
        }
    }

}
