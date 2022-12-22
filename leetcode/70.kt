//dp
class Solution {

    fun climbStairs(n: Int): Int {
        if(n <= 1) return ONE_STEP

        var stepWays = IntArray(n+1)
        stepWays[0] = ONE_STEP
        stepWays[1] = ONE_STEP
        for(i in 2..n) {
            stepWays[i] = stepWays[i-1] + stepWays[i-2]
        }
        return stepWays[n]
    }

    companion object{
        const val ONE_STEP = 1
    }
}
