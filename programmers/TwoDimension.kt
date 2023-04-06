class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        
        for(i in 0 until num_list.size){
            val arr = ArrayList<Int>()
            for(j in 0 until n){
                arr.add(num_list[i])
            }
            answer.add(arr[i])
        }
        
        return answer
    }
}
