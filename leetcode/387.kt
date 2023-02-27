class Solution {
    fun firstUniqChar(s: String): Int {
        var charIndex = mutableMapOf<Char, Int>()

        for(i in 0 until s.length) {
            charIndex[s[i]] = charIndex.getOrDefault(s[i], 0) + 1
            
        }

        for(i in 0..s.length-1) {
            if(charIndex[s[i]] == 1) return i
        }
        return -1
    }
}
