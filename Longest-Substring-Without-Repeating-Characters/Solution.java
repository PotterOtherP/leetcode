public class Solution {

    public static int lengthOfLongestSubstring(String s)
    {

        if (s.length() < 2) return s.length();

        int result = 1;

        while (result < s.length())
        {
            int i = 1;
            char start = s.charAt(0);

            while (i < s.length() && s.charAt(i) != start)
            {
                CharSequence seq = "" + s.charAt(i);
                if (s.substring(0,i).contains(seq)) break;
                ++i;
            }

            if (i > result) result = i;

            s = s.substring(1);
        }

        return result;
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