class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = nums.groupBy { it }
        val half = nums.size / 2
        var answer = Integer.MIN_VALUE

    map.forEach { (key, value) ->
        var counter = 0
        value.forEach {
            counter++
        }
        if(counter > half)
            result = key
    }
    return answer
    }
}
