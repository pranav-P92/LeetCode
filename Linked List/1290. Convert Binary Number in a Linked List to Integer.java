//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/


//time complexity : O(n)
//space complexity : O(1)

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
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode current=head;
        ListNode current2=head;

        int num;
        int count=0;
        int n=0;
        while(current.next!=null){
            count+=1;
            current=current.next;
        }
        while(current2!=null){
            //num=(current2.val)*(int)Math.pow(2,count);
            num=(current2.val)*(1<<count);  //(1<<count -> 2^count)
            n+=num;
            count--;
            current2=current2.next;
        }

        return n;
    }
}
