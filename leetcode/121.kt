class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxPrice = Int.MIN_VALUE
        var profit = 0
        for(i in prices){
            if(i < minPrice){
                minPrice = i
                maxPrice = i
            }
            if(i > maxPrice){
                maxPrice = i
            }
            profit = maxOf(profit, maxPrice - minPrice)
        }
        return profit
    }
}
