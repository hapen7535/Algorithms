class Solution{
     fun solution(s: String) = s.toSet()
        .filter { uniqueChar ->
            s.count { it == uniqueChar } == 1
        }.sorted().joinToString("")   
}
