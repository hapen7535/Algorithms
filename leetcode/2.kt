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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ans: ListNode? = null
        var head: ListNode? = null
        var c = 0
        var _l1: ListNode? = l1
        var _l2: ListNode? = l2
        while(_l1 != null || _l2 != null){
            val a = if(_l1 == null) 0 else _l1?.`val`
            val b = if(_l2 == null) 0 else _l2?.`val`
            
            val sum = a + b + c
            
            if(ans == null){
                ans = ListNode(sum % 10)
                head = ans
            }else{
                ans?.next = ListNode(sum % 10)
                ans = ans?.next
            }
            
            c = sum/10
            
            _l1 = _l1?.next
            _l2 = _l2?.next
        }
        
        if(c > 0) ans?.next = ListNode(c)
        
        return head
    }
}
