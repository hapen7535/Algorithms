class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carryOver = 1
        
        for (i in digits.size - 1 downTo 0) {
            digits[i] += carryOver
            carryOver = digits[i] / 10
            
            if (carryOver == 0) return digits
            
            digits[i] %= 10
        }
        
        return intArrayOf(carryOver, *digits)
    }
}
