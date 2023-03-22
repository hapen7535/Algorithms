class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        
        val orderWords = order.toString()
        for(word in orderWords){
            if(word != '0'&& word.toInt() % 3 == 0){
                answer++
            }
        }
        
        return answer
    }
}
