/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return head

        val stack = Stack<ListNode>()
        var pointer = head

        while (pointer != null) {
            stack.push(pointer)
            pointer = pointer.next
        }
        
        val newHead = stack.pop()
        pointer = newHead
        while(stack.isNotEmpty()) {
            pointer?.next = stack.pop()
            pointer = pointer?.next
        }
        pointer?.next = null
        return newHead
    }
}
