import java.util.PriorityQueue

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        
        val printerWaitingList = PriorityQueue<Int>(reverseOrder()).apply{ priorities.map(::offer)}
        
        while(printerWaitingList.isNotEmpty()){
            for(i in priorities.indices){
                if(printerWaitingList.peek() == priorities[i]){
                    printerWaitingList.poll()
                    answer++
                    
                    if(i == location){
                        printerWaitingList.clear()
                        break
                    }
                }
            }
        }
        
        return answer
    }
}
