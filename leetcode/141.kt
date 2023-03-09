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
    fun hasCycle(head: ListNode?): Boolean {
        var node = head
        var list = mutableListOf<ListNode>()
        while(node != null){
            if(list.contains(node)) return true
            else list.add(node)
            node = node.next
        }
        return false
    }
}
