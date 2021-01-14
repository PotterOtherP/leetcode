/**
 *
 * https://leetcode.com/problems/add-two-numbers/
 *
 */

public class AddTwoNumbersTest {
    
    public static void main(String[] args) {

        System.out.println();

        int[] test1 = {2, 4, 3};
        int[] test2 = {5, 6, 4};
        int[] test3 = {0};
        int[] test4 = {0};
        int[] test5 = {9, 9, 9, 9, 9, 9, 9};
        int[] test6 = {9, 9, 9, 9};


        ListNode l1 = createListFromArray(test1);
        ListNode l2 = createListFromArray(test2);
        ListNode l3 = createListFromArray(test3);
        ListNode l4 = createListFromArray(test4);
        ListNode l5 = createListFromArray(test5);
        ListNode l6 = createListFromArray(test6);
        ListNode output = Solution.addTwoNumbers(l1, l2);

        l1.printList();
        System.out.println(" + ");
        l2.printList();
        System.out.println(" = ");
        output.printList();

        System.out.println();
        System.out.println();

        output = Solution.addTwoNumbers(l3, l4);
        l3.printList();
        System.out.println(" + ");
        l4.printList();
        System.out.println(" = ");
        output.printList();

        System.out.println();
        System.out.println();

        output = Solution.addTwoNumbers(l5, l6);
        l5.printList();
        System.out.println(" + ");
        l6.printList();
        System.out.println(" = ");
        output.printList();
        
    }

    public static ListNode createListFromArray(int[] nums)
    {
        ListNode result = new ListNode();
        ListNode counter = result;

        for (int i = 0; i < nums.length; ++i)
        {
            counter.val = nums[i];

            if (i < nums.length - 1)
            {
                counter.next = new ListNode();
                counter = counter.next;
            }
        }

        return result;
    }
}