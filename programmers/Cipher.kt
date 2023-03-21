class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        var codeIdx = code
        
        while(codeIdx <= cipher.length){
            answer += cipher[codeIdx - 1]
            codeIdx += code
        }
        
        return answer
    }
}
