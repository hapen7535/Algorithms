class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        val nAddedArray = array.plus(n).sorted()
        val nIdx = nAddedArray.indexOf(n)
        
        if(nIdx == 0){
            return nAddedArray[1]
        } else if(nIdx == nAddedArray.size - 1){
            return nAddedArray[nIdx - 1]
        } else{
            if(n - nAddedArray[nIdx - 1] > nAddedArray[nIdx + 1] - n) return nAddedArray[nIdx + 1]
            else return nAddedArray[nIdx - 1]
        }
        
        
        return answer
    }
}
