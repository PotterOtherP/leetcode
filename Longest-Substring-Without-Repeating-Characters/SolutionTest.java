/**
 * Description: Given a string s, find the length of the longest substring
 * without repeating characters.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class SolutionTest {
    
    public static void main(String[] args) {
        
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";

        System.out.println("Input: s = \"" + test1 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test1));
        System.out.println();

        System.out.println("Input: s = \"" + test2 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test2));
        System.out.println();

        System.out.println("Input: s = \"" + test3 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test3));
        System.out.println();

        System.out.println("Input: s = \"" + test4 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test4));
        System.out.println();

    }
}