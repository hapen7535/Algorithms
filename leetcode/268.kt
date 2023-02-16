class Solution {
    fun missingNumber(nums: IntArray): Int {
        val sortedArray = nums.sorted()
        
        for (i in 0..sortedArray.size) {
            if (i > sortedArray.lastIndex) return i
            if (i != sortedArray[i]) return i
        }
        
        return -1
    }
}
