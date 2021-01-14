class Solution {
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode result = new ListNode(0);
        ListNode counter = result;

        while (l1 != null || l2 != null)
        {
            int addOne = 0;

            if (l1 != null)
            {
                counter.val += l1.val;
                l1 = l1.next;
            }

            if (l2 != null)
            {
                counter.val += l2.val;
                l2 = l2.next;
            }

            if (counter.val >= 10)
            {
                counter.val %= 10;
                addOne = 1;
            }

            if (l1 != null || l2 != null)
            {
                counter.next = new ListNode(addOne);
                counter = counter.next;
            }

            else if (addOne == 1)
                counter.next = new ListNode(addOne);
        }

        return result;
    }
}