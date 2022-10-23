class Solution {
    fun romanToInt(s: String): Int {
        val map: HashMap<Char, Int> = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var sum = 0
        var i = s.length-1
        while (i>0) {
          
            val cur = map[s[i]] ?: 0
            val pre = map[s[i-1]] ?: 0
          
            if (cur > pre) {
                sum += cur-pre
                i-=2
            } else {
                sum += cur ?: 0    
                i--
            }
        }
        if (i==0) {
            sum += map[s[i]] ?: 0
        }
        return sum
    }
}
