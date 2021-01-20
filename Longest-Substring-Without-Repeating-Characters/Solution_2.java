// This is a faster solution based on the "sliding window" concept.
public class Solution_2 {

    public static int lengthOfLongestSubstring(String s)
    {
        if (s.length() < 2) return s.length();

        String longest = "" + s.charAt(0);
        int len = 1;

        for (int i = 1; i < s.length(); ++i)
        {
            int index = longest.indexOf(s.charAt(i));

            if (index != -1)
            {
                longest = longest.substring(index + 1);
            }

            longest += s.charAt(i);

            if (longest.length() > len)
                len = longest.length();

        }


        return len;
    }

}