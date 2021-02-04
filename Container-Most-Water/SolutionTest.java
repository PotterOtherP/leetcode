public class SolutionTest {

    public static void main(String[] args) {
        
        int[] test1 = {1,8,6,2,5,4,8,3,7};
        int[] test2 = {1,1};
        int[] test3 = {4,3,2,1,4};
        int[] test4 = {1,2,1};

        printArray(test1);
        System.out.print(" Result: " + Solution.maxArea(test1) + "\n");

        printArray(test2);
        System.out.print(" Result: " + Solution.maxArea(test2) + "\n");

        printArray(test3);
        System.out.print(" Result: " + Solution.maxArea(test3) + "\n");

        printArray(test4);
        System.out.print(" Result: " + Solution.maxArea(test4) + "\n");
    }

    public static void printArray(int[] x)
    {
        System.out.print("Array: {");
        for (int i = 0; i < x.length; ++i)
            System.out.print(" " + x[i]);
        System.out.print(" }");
    }   
}