public class SolutionTest {
    
    public static void main(String[] args) {
        
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "a";
        String test4 = "ac";
        String test5 = "xyzabcdcba";

        System.out.println("String: " + test1 + " Result: " + Solution.longestPalindrome(test1));
        System.out.println("String: " + test2 + " Result: " + Solution.longestPalindrome(test2));
        System.out.println("String: " + test3 + " Result: " + Solution.longestPalindrome(test3));
        System.out.println("String: " + test4 + " Result: " + Solution.longestPalindrome(test4));
        System.out.println("String: " + test5 + " Result: " + Solution.longestPalindrome(test5));
    }
}