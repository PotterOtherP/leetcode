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
        String test4 = "qfrhksyvgrqwyfbtruqecgbdibodv";

        System.out.println(test4.substring(0, test4.length() - 1));
        System.out.println(test4.substring(1, test4.length()));

        System.out.println("Input: s = \"" + test1 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test1));
        System.out.println("Output 2: " + Solution_2.lengthOfLongestSubstring(test1));
        // System.out.println("Recursive output: " + Recursive.lengthOfLongestSubstring(test1));
        System.out.println();

        System.out.println("Input: s = \"" + test2 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test2));
        System.out.println("Output 2: " + Solution_2.lengthOfLongestSubstring(test2));
        // System.out.println("Recursive output: " + Recursive.lengthOfLongestSubstring(test2));
        System.out.println();

        System.out.println("Input: s = \"" + test3 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test3));
        System.out.println("Output 2: " + Solution_2.lengthOfLongestSubstring(test3));
        // System.out.println("Recursive output: " + Recursive.lengthOfLongestSubstring(test3));
        System.out.println();

        System.out.println("Input: s = \"" + test4 + "\"");
        System.out.println("Output: " + Solution.lengthOfLongestSubstring(test4));
        System.out.println("Output 2: " + Solution_2.lengthOfLongestSubstring(test4));
        // System.out.println("Recursive output: " + Recursive.lengthOfLongestSubstring(test4));
        System.out.println();

    }
}