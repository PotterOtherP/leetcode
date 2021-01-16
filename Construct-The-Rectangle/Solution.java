public class Solution {

    public static int[] constructRectangle(int area) {

        int length = (int)Math.ceil(Math.sqrt(area));
        int width = (int)Math.floor(Math.sqrt(area));

        while (area % length != 0 && length < area)
        {
            ++length;
            
        }

        while (area % width != 0 && width > 1)
        {
            --width;
            
        }



        int[] result = new int[2];
        result[0] = length;
        result[1] = width;

        return result;
    }
}