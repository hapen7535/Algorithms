class Solution {
    fun solution(clothes: Array<Array<String>>) = clothes
        .groupBy { it[1] }.values
        .map { it.size + 1 }
        .reduce(Int::times)
        .minus(1)
}
