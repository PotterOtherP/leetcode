public class Recursive {
    
    public static int lengthOfLongestSubstring(String s) {


        return 0;
    }

    public static boolean isNonRepeating(String s)
    {
        int len = s.length();
        if (len < 2) return true;

        for (int i = 0; i < len - 1; ++i)
        {
            for (int j = i + 1; j < len; ++j)
            {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }

        return true;
    }
}