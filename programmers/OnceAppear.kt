class Solution{
     fun solution(s: String) = s.toSet()
        .filter { uniqueChar ->
            s.count { it == uniqueChar } == 1
        }.sorted().joinToString("")  
        
     fun solution2(s: String): String {
        return s.split("".toRegex())
            .groupBy { it }
            .entries
            .filter { (_, value) -> value.size <= 1 }
            .map { (key, _) -> key }
            .sorted()
            .joinToString("")
    }
}
