import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        var numberOfBridgeWeight = weight
        
        var trucksInBridge : Queue<Int> = LinkedList()
        var trucks : Queue<Int> = LinkedList()
        
        for(i in 0 .. truck_weights.size - 1){
            trucks.add(truck_weights[i])
        }
        
        for(i in 0 .. bridge_length - 1){
            trucksInBridge.add(0)
        }
        
//         val trucksInBridge: Queue<Int> = LinkedList(List(bridge_length){0})
//         val truck: Queue<Int> = LinkedList(truck_weights.toList())
        
        while(!trucksInBridge.isEmpty()){
            if(trucksInBridge.peek() > 0) numberOfBridgeWeight += trucksInBridge.peek()
            
            trucksInBridge.poll()
            
            if(!trucks.isEmpty()){
                if(numberOfBridgeWeight >= trucks.peek()){
                    numberOfBridgeWeight -= trucks.peek()
                    trucksInBridge.add(trucks.poll())
                } else{
                    trucksInBridge.add(0)
                }
            }
            answer++
        }
        
        return answer
    }
    
    fun solution2(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val bridgeQueue: Queue<Int> = LinkedList(List(bridge_length){0})
        val waitingQueue: Queue<Int> = LinkedList(truck_weights.toList())
        
        while(bridgeQueue.isNotEmpty()) {
            answer++
            bridgeQueue.poll()
            if(waitingQueue.isNotEmpty()){
                if(bridgeQueue.sum() + waitingQueue.peek() <= weight){
                    bridgeQueue.add(waitingQueue.poll())
                } else{
                    bridgeQueue.add(0)
                }
            }
        }
        return answer
    }
    
}
