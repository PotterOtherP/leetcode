public class Solution {

    public static String convert(String s, int numRows) {
    
        int len = s.length();

        if (len < 2) return s;
        if (numRows < 2) return s;

        String result = "";

        for (int row = 1; row <= numRows; ++row)
        {
            int index = row - 1;

            if (index >= len) break;
            result += s.charAt(index);
            
            if (row == 1 || row == numRows)
            {
                while (index < len)
                {
                    index += 2 * (numRows - 1);
                    if (index >= len) break;
                    result += s.charAt(index);
                }
            }

            else
            {
                while (index < len)
                {
                    index += 2 * (numRows - row);
                    if (index >= len) break;
                    result += s.charAt(index);

                    index += 2 * (row - 1);
                    if (index >= len) break;
                    result += s.charAt(index);
                    
                }
            }
        }


        return result;

    }
}