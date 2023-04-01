class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        result.add(mutableListOf<Int>())

        nums.forEach { n ->
            result.map { it + n }.forEach { result.add(it) }
        }
        
        return result
    }
}
