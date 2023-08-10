/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


java Program :
*/

class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        int num1 = 0, i = 0;
        
    //     // Calculate the first number from list1
    //     while (head1 != null) {
    //         num1 += head1.val * (int) Math.pow(10, i++);
    //         head1 = head1.next;
    //     }

    //     // Add the digits of list2 to num1
    //     ListNode head2 = list2; // Renamed head1 to head2 for clarity
    //     i = 0;
    //     while (head2 != null) {
    //         num1 += head2.val * (int) Math.pow(10, i++);
    //         head2 = head2.next;
    //     }
      
    //     // Now num1 contains the sum of the two numbers
        
    //     // Handle the case where the sum is 0
    //     if (num1 == 0) {
    //         return new ListNode(0);
    //     }
        
    //     // Reconstruct the linked list with the digits of the sum
    //     ListNode dummy = new ListNode(); // Use a dummy node
    //     ListNode current = dummy;
        
    //     while (num1 > 0) {
    //         ListNode newNode = new ListNode(num1 % 10);
    //         current.next = newNode;
    //         current = newNode;
    //         num1 /= 10;
    //     }
        
    //     return dummy.next;
    // }

    ListNode ans = new ListNode(0);
    ListNode current = ans;
    int carry = 0;

    while(list1!=null || list2!=null){
        int x = (list1!=null)?list1.val : 0;
        int y = (list2!=null)?list2.val : 0;

        int sum = x+y+carry;

        carry = sum/10;
        ListNode newNode = new ListNode(sum%10);
        current.next = newNode;
        current = current.next;
        if(list1!=null) list1 = list1.next;
        if(list2!=null) list2 = list2.next;
    }
    if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return ans.next;
    }
}


/*
Runtime: 2ms
memory : 42.78mb
*/
