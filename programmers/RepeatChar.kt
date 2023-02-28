class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        
        for(i in my_string)
            for(j in 0 until n)
                answer += i

        return answer
    }
    
     fun solution2(my_string: String, n: Int) = my_string.map { it.toString().repeat(n) }.joinToString("")
}
