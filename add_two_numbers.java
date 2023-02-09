class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //declare a dummy node
        ListNode dummy = new ListNode(0);
        //declare a current node and set it to dummy
        ListNode curr = dummy;
        //declare a carry variable
        int carry = 0;
        //while loop to go through the list and add up the numbers
        while(l1 != null || l2 != null){
            //declare a x and y variable and set it to 0
            int x = 0;
            int y = 0;
            //if the l1 is not null set x to l1.val
            if(l1 != null){
                x = l1.val;
            }
            //if the l2 is not null set y to l2.val
            if(l2 != null){
                y = l2.val;
            }
            //declare a sum and set it to x + y + carry
            int sum = x + y + carry;
            //set the carry to sum / 10
            carry = sum / 10;
            //set the curr.next.val to sum % 10
            curr.next = new ListNode(sum % 10);
            //set the curr to curr.next
            curr = curr.next;
            //if the l1 is not null set l1 to l1.next
            if(l1 != null){
                l1 = l1.next;
            }
            //if the l2 is not null set l2 to l2.next
            if(l2 != null){
                l2 = l2.next;
            }
        }
        //if the carry is not 0 set the curr.next to the new ListNode(carry)
        if(carry != 0){
            curr.next = new ListNode(carry);
        }
        //return the dummy.next
        return dummy.next;
    }
}