class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        return when (list1.`val`.compareTo(list2.`val`)) {
            EVEN_NUMBER, BEAT_NUMBER -> list2.apply { next = mergeTwoLists(list1, list2.next) }
            else -> list1.apply { next = mergeTwoLists(list2, list1.next) }
        }
    }

    companion object{
        const val EVEN_NUMBER = 0
        const val BEAT_NUMBER = 1
    }

}
