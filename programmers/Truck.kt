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
}
