import java.util.PriorityQueue;

class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf(0,0)
        
        var minNumbers = PriorityQueue<Int>()
        var maxNumbers = PriorityQueue<Int>(reverseOrder())
        
        for(i in operations.indices){
            val operation : List<String> = operations[i].split(" ")
            when(operation[0]){
                "I" -> {
                    maxNumbers.add(operation[1].toInt())
                    minNumbers.add(operation[1].toInt())
                }
                "D" -> {
                    if(maxNumbers.isNotEmpty() && minNumbers.isNotEmpty()){
                        if(operation[1] == "1"){
                            val maxNumber = maxNumbers.poll()
                            minNumbers.remove(maxNumber)
                        } else{
                            val minNumber = minNumbers.poll()
                            maxNumbers.remove(minNumber)
                        }
                    }
                }
            }
        }
        
        if(maxNumbers.isNotEmpty() && minNumbers.isNotEmpty())
            return intArrayOf(maxNumbers.poll(), minNumbers.poll())
        else
            return intArrayOf(0, 0)
        

    }
}
