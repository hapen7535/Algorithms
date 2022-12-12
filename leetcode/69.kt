class Solution {
    fun mySqrt(x: Int): Int {
        if(x < 2) return x
        
        var left = 2
        var right = x / 2
        
        while(left <= right) {
            var mid = left + (right - left) / 2
            var squaredMid: Long = mid.toLong() * mid.toLong()
            
            
            if(squaredMid > x) right = mid - 1
            else if (squaredMid < x) left = mid + 1
            else return mid
        }
        
        return right
    }
}
