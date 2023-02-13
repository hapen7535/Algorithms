class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var min: Long = 0
        var max: Long = (1_000_000_000 * n.toLong())

        while (min < max) {
            val mid = (min + max) / 2
            var count: Long = 0
            for (time in times) {

                val cap: Long = mid / time
                count += cap
            }
            if (count >= n) {

                max = mid
            } else {
                min = mid + 1
            }
        }
        return min
    }
}
