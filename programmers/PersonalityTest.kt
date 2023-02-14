class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val personalities = listOf("RT", "CF", "JM", "AN")
        return choices
            .mapIndexed { index, i ->
                if (i-4 < 0) {
                    survey[index][0] to -(i-4)
                } else {
                    survey[index][1] to (i-4)
                }
            }
            .groupBy { it.first }
            .map { it.key to it.value.sumOf { v:Pair<Char, Int> -> v.second } }
            .toMap()
            .let { ans:Map<Char, Int> ->
                personalities.map {
                    if (ans.getOrDefault(it[0], 0) >= ans.getOrDefault(it[1], 0)) it[0] else it[1]
                }
            }
            .joinToString("")
    }
}
