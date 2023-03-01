class Solution {
    fun solution(str1: String, str2: String): Int = if(str2 in str1) 1 else 2
    fun solution2(str1: String, str2: String): Int = if(str1.contains(str2)) 1 else 2
}
