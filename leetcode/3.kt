class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0

        var longestSubString = ""
        var maxLen = 0
        
        for (i in s.indices) {
            if (!longestSubString.contains(s[i])) {
                longestSubString += s[i]
                val length = longestSubString.length
                if (maxLen < length) maxLen = length
            } 
            else longestSubString = longestSubString.substring(longestSubString.indexOf(s[i])+1) + s[i]
        }
        
        return maxLen
    }
}
