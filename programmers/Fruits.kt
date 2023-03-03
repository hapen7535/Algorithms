class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        var idx: Int = 0
        
        while(true){
            if(idx >= score.size || idx + m > score.size) break
            answer += score[idx + m - 1] * m
            idx += m
        }
        return answer
    }
}
