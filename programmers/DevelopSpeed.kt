import java.util.Stack

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        
        var answer = ArrayList<Int>()
        var completeRate = Stack<Int>()
        var progressSpeed = Stack<Int>()
        var count = 0
        var day = 1
        
        for(i in progresses.size -1 downTo 0){
            completeRate.push(progresses[i])
            progressSpeed.push(speeds[i])
        }
        
        while(completeRate.size != 0){
        
            if((completeRate.peek() + (progressSpeed.peek()*day)) >= 100){
                count = checkCompleteProgress(completeRate, progressSpeed, count, day)
                answer.add(count)
                count = 0
            }
            else{
                day += 1
            }
            
        }
        return answer.toIntArray()
        
    }
    
    private fun checkCompleteProgress(completeRate : Stack<Int>, progressSpeed : Stack<Int>, currentCount : Int, day : Int) : Int{
        var count = currentCount
        while(completeRate.size > 0 && (completeRate.peek() + (progressSpeed.peek()*day)) >= 100){
            completeRate.pop()
            progressSpeed.pop()
            count += 1
        }
        return count
    }
    
}
