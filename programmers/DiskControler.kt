import java.util.PriorityQueue

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var answer = 0
        var currentTime = 0
        var waitingList = PriorityQueue<Job>(compareBy{it.startTime})
        
        for(i in 0 until jobs.size){
            var job = Job(jobs[i][0], jobs[i][1])
            waitingList.offer(job)
        }
        
        
        while(waitingList.isNotEmpty()){
            
            var readyList = PriorityQueue<Job>(compareBy{it.runningTime})
            while(waitingList.isNotEmpty() && currentTime >= waitingList.peek().startTime){
                readyList.offer(waitingList.poll())
            }
            
            if(readyList.isEmpty()){
                currentTime++
                continue
            }
            currentTime += readyList.peek().runningTime
            answer += currentTime - readyList.peek().startTime
            readyList.poll()
            
            for(i in 0 until readyList.size){
                waitingList.offer(readyList.poll())
            }
        }
        
        answer /= jobs.size
        return answer
    }
}

data class Job(
    var startTime : Int = 0,
    var runningTime : Int = 0
)
