/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy node to simplify list creation
        ListNode current = dummy;         // pointer to build the new list
        int carry = 0;                    // to store carry over

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;              // start with carry
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;             // new carry
            current.next = new ListNode(sum % 10); // add node for current digit
            current = current.next;
        }

        return dummy.next; // return the real head
    }
}