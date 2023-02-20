class Solution {
    
    var answer = -1
    fun solution(N: Int, number: Int): Int {
        dfs(N, 0, 0, number, "")
        return answer
    }

    fun dfs(n:Int, pos:Int, num:Int, number: Int, string: String) {
        if(pos > 8) {
            return
        }

        if(num == number) {
            if(answer == -1 || pos < answer) {
                answer = pos
            }
            return
        }

        var nn = 0
        
        for(i in 0 until 8) {
            nn = nn*10 + n
            dfs(n, pos + i + 1, num + nn, number,"$string+")
            dfs(n, pos + i + 1, num - nn, number,"$string-")
            dfs(n, pos + i + 1, num * nn, number,"$string*")
            dfs(n, pos + i + 1, num / nn, number,"$string/")
        }
    }

}
