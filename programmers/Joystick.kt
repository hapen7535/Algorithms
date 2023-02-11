class Solution {
    fun solution(name: String): Int {
         var answer = 0

        for(i in name.indices){
            answer += (name[i] - 'A').coerceAtMost('Z' - name[i] + 1)
        }

        var minMove = name.length -1
        for(i in name.indices){
            if(name[i] != 'A'){
                var next = i + 1
                while(next < name.length && name[next] == 'A'){
                    next++
                }
                var move = 2 * i + name.length - next
                minMove = move.coerceAtMost(minMove)
            }
        }



        return answer + minMove
    }
}
