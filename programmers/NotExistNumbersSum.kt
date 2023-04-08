class Solution {
    fun solution(numbers: IntArray): Int {
        val numbersSum = numbers.sum()
        val entireSum = 45
        
        return entireSum - numbersSum
    }
}
