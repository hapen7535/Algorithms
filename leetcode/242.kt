class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val word1 = s.toCharArray().sorted()
        val word2 = t.toCharArray().sorted()
        
        if (word1 == word2)
            return true
        return false
    }
}
