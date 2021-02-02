public class Solution {

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x < 10) return true;

        double dx = x * 1.0;
        int numDigits = (int)Math.ceil(Math.log10(dx));
        if (x == Math.pow(10, numDigits)) ++numDigits;

        int[] digitsArray = new int[numDigits];

        for (int i = 0; i < digitsArray.length; ++i)
        {
            digitsArray[i] = x % 10;
            x /= 10;
        }

        for (int i = 0; i <= numDigits / 2; ++i)
        {
            if (digitsArray[i] != digitsArray[numDigits - 1 - i])
                return false;
        }

        return true;
    }
}