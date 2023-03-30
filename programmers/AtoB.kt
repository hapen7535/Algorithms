class Solution {
    fun solution(before: String, after: String): Int {
        val beforeArray = before.toCharArray().sorted() 
        val afterArray = after.toCharArray().sorted()
        if(beforeArray.equals(afterArray)) return 1
        return 0
    }
}
