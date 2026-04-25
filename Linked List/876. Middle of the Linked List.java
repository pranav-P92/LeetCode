//https://leetcode.com/problems/middle-of-the-linked-list/description/

//time Complexity : O(n)
//space Complexity : O(1)


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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        ListNode current2=head;
        int length=0;
        while(current!=null){
            length+=1;
            current=current.next;
        }
        int size;
        size=(length/2)+1;
        for(int i=1;i<size;i++){
            current2=current2.next;
        }
        return current2;
    }
}
