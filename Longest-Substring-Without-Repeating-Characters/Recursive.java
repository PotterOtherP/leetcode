// This did not pass on LeetCode because it timed out, but it should work
public class Recursive {
    
    public static int lengthOfLongestSubstring(String s)
    {

        if (s.length() < 2) return s.length();

        String[] firstLevel = {s};

        return getResult(firstLevel);
    }

    public static int getResult(String[] level)
    {
        if (checkLevel(level))
            return (level[0].length());

        else
            return getResult(constructNextLevel(level));
    }

    public static boolean checkLevel(String[] level)
    {
        for (String s : level)
            if (checkString(s))
                return true;

        return false;
    }

    public static String[] constructNextLevel(String[] level)
    {
        String[] result = new String[level.length * 2];

        for (int i = 0; i < level.length; ++i)
        {
            result[2 * i] = level[i].substring(0, level[i].length() - 1);
            result[(2 * i + 1)] = level[i].substring(1, level[i].length());
        }

        return result;   
    }

    public static boolean checkString(String s)
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