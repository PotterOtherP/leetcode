public class ListNode {
   
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; } 
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }

   public void printList()
   {
        String str = "";
        str += ("[" + this.val);
        ListNode counter = this;

        while (counter.next != null)
        {
            str += (", " + counter.next.val);
            counter = counter.next;
        }

        str += "]";

        System.out.print(str);
   }
}