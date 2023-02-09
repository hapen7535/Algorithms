class Solution {
    fun solution(sizes: Array<IntArray>): Int {

        var width = 0
        var height = 0

        sizes.forEach{
            it.sortDescending()
            width = Math.max(width,it[0])
            height = Math.max(height,it[1])
        }

        return width * height
    }
}
