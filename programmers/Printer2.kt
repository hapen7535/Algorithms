//프린터 풀이2
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val printQueue = priorities.withIndex().toMutableList()

        while (printQueue.isNotEmpty()) {
            val current = printQueue.first()
            printQueue.removeAt(0)
            if (printQueue.any { it.value > current.value }) printQueue.add(current)
            else {
                ++answer
                if (location == current.index) {
                    break
                }
            }
        }
        return answer
    }
}
