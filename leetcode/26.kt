class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var size  = 1
        for (i in 1..nums.size-1){
            if (nums[i-1] != nums[i]){
                nums[size]=nums[i]
                size++
            }
        }
        return size
    }
}
