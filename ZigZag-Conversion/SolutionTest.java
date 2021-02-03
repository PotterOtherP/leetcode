public class SolutionTest {

    public static void main(String[] args) {
        
        String test1 = "PAYPALISHIRING";
        int num1 = 4;

        
        String test2 = "PAYPALISHIRING";
        int num2 = 3;

        String test3 = "AB";
        int num3 = 1;

        System.out.println(num1 + " rows: " + test1 + " --> " + Solution.convert(test1, num1));
        System.out.println(num2 + " rows: " + test2 + " --> " + Solution.convert(test2, num2));
        System.out.println(num3 + " rows: " + test3 + " --> " + Solution.convert(test3, num3));
    }
}