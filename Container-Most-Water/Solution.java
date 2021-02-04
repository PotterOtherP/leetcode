public class Solution {

    public static int maxArea(int[] height) {
        
        int result = 0;
        int max = 0;
        int len = height.length;
        
        for (int i = 0; i < len - 1; ++i)
        {
            for (int j = i + 1; j < len; ++j)
            {
                int h = getArea(height, i, j);
                if (h > max) max = h;
            }
        }

        return max;
    }
    
    public static int getArea(int[] heights, int index1, int index2) {
        return Math.abs(index1 - index2) * Math.min(heights[index1], heights[index2]);
    }
}