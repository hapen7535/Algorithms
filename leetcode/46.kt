class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()
        permuteRecursive(result, nums.toList())
        return result
    }
        
    fun permuteRecursive(result: MutableList<List<Int>>, numsLeft: List<Int>, currentList: List<Int> = emptyList()) {
        if(numsLeft.isEmpty()) result.add(currentList)

        numsLeft.forEach { permuteRecursive(result, numsLeft - it, currentList + it) }
        }
    }
}
