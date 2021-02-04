public class SolutionTest {
    
    public static void main(String[] args) {
        
        String test1 = "  12345";
        String test2 = "    -45654";
        String test3 = "A111";
        String test4 = "4321abcd";

        System.out.println("Input string: " + test1 + "\tOutput integer: " + Solution.myAtoi(test1));
        System.out.println("Input string: " + test2 + "\tOutput integer: " + Solution.myAtoi(test2));
        System.out.println("Input string: " + test3 + "\tOutput integer: " + Solution.myAtoi(test3));
        System.out.println("Input string: " + test4 + "\tOutput integer: " + Solution.myAtoi(test4));
    }
}