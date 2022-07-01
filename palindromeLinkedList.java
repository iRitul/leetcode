// Given the head of a singly linked list, return true if it is a palindrome.

 

// Example 1:


// Input: head = [1,2,2,1]
// Output: true


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
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        ListNode currNode = head;
        while(currNode != null){
            s.append(currNode.val);
            currNode = currNode.next;
        }
        String prevString = s.toString();
        String revString = s.reverse().toString();
        if(prevString.equals(revString)){
            return true;
        }else{
            return false;
        }
    }
}
