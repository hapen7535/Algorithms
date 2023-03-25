class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0 
        for(i in 1..n){
            if(verifyCompositeNum(i)){
                answer++
            }
        }
        return answer
    }
    
    fun verifyCompositeNum(n: Int): Boolean{
        var count = 0
        for(idx in 1..n){
            if(n % idx == 0) count ++
        }
        if(count >= 3) return true
        return false
    }
}
