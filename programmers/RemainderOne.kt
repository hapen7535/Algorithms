class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var i:Int = 1
        while(true){
            if(n % i == 1) return i
            i++
        }
        return answer
    }
    fun solution2(n: Int) = (1..n).first { n % it == 1 }
}
