class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        val numbers = mutableListOf<Int>()
        val zeroes = mutableListOf<Int>()
        nums.forEach {
            when (it) {
                0 -> zeroes.add(it)
                else -> numbers.add(it)
            }
        }
        val sorted = numbers + zeroes
        (sorted).indices.forEach {
            nums[it] = sorted[it]
        }
    }
}
