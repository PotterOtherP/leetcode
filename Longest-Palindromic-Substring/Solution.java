public class Solution {
    
    public static String longestPalindrome(String s) {
        
        // Initial case
        if (s.length() < 2) return s;
        
        for (int i = s.length(); i >= 2; --i)
        {
            for (int j = 0; j <= s.length() - i; ++j)
            {
                String test = s.substring(j, j + i);
                if (isPalindrome(test))
                    return test;
            }
        }
        
        
        // End case
        return s.substring(0, 1);
    }
    
    public static boolean isPalindrome(String s) {
        
        for (int i = 0; i <= (s.length() - 1) / 2; ++i)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        
        return true;
    }
}