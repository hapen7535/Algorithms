class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var res = 0
        
        for (char in columnTitle) {
            res = res * ALPHABET_TOTAL_COUNT //자릿수가 넘어갈 경우
            res += char - 'A' + 1 
        }
        
        return res
    }

    companion object{
        const val ALPHABET_TOTAL_COUNT = 26
    }
}
