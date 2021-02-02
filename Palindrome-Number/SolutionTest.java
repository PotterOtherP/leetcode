public class SolutionTest {

    public static void main(String[] args) {
        
        int test1 = 22;
        int test2 = 121;

        int test3 = -121;
        int test4 = 10000;
        int test5 = 1234321;

        System.out.println("x = " + test1 + ", palindrome: " + Solution.isPalindrome(test1));
        System.out.println("x = " + test2 + ", palindrome: " + Solution.isPalindrome(test2));
        System.out.println("x = " + test3 + ", palindrome: " + Solution.isPalindrome(test3));
        System.out.println("x = " + test4 + ", palindrome: " + Solution.isPalindrome(test4));
        System.out.println("x = " + test5 + ", palindrome: " + Solution.isPalindrome(test5));
    }
}