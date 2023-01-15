class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numberSize = nums.size
        val hashmap = hashMapOf<Int, Int>()
        for (num in nums) {
            if (hashmap.containsKey(num)) return true
            hashmap[num] = numberSize
        }
        return false
    }
}
