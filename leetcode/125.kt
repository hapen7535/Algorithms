class Solution {
    fun isPalindrome(s: String): Boolean {
        val filteredInput = s.toLowerCase().filter { it in 'a'..'z' || it in '0'..'9' }
        return filteredInput == filteredInput.reversed()   
    }
}
