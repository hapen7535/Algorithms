import kotlin.math.*

class Solution {
    var answer = 0
    lateinit var visit: BooleanArray
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visit = BooleanArray(dungeons.size)
        dfs(0, k, dungeons)
        return answer
    }

    private fun dfs(depth: Int, k: Int, dungeons: Array<IntArray>) {
        for (i in dungeons.indices) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true
                dfs(depth + 1, k - dungeons[i][1], dungeons)
                visit[i] = false
            }
        }
        answer = max(answer, depth)
    }
}
