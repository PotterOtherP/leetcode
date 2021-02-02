public class Solution {

    public static int largestSubmatrix(int[][] matrix) {

        int area = 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Start with height of m
        int currentHeight = m;
        
        while (largerSubmatrixCanExist(area, currentHeight, n))
        {
            // Iterate over the matrix to find a vertical block of 1's of "height"
            
            // If a block is found, iterate over the other columns to
            // find other blocks in the same position. If one is found,
            // increment the cu
        }
        
        return area;
    }
    
    public static boolean largerSubmatrixCanExist(int area, int height, int width)
    {
        return area < (height - 1) * width;
    }
}