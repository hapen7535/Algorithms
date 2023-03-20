import java.util.Collections

class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()
        val rotatedNumbers = numbers.toList()
        if(direction == "right"){
            Collections.rotate(rotatedNumbers, 1)
        } else{
            Collections.rotate(rotatedNumbers, -1)
        }
        return rotatedNumbers.toIntArray()
    }
}
