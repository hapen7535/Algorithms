class Solution {
    fun solution(word: String): Int {
        var answer = word.length
        val charDic = hashMapOf<Char,Int>('A' to 0, 'E' to 1, 'I' to 2, 'O' to 3, 'U' to 4)
        var idx = (((5 + 1) * 5 + 1) * 5 + 1) * 5 + 1
        for(i in word){
            answer += ( idx * charDic[i]!! )
            idx = (idx - 1) / 5
        }
        return answer
    }

}
