class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0)
    }

    private fun dfs(numbers : IntArray, target : Int, index : Int, result : Int) : Int{
        var targetNumber = 0
        if (index == numbers.size) {
            if (result == target) targetNumber += 1
        } else {
            targetNumber = dfs(numbers, target, index + 1, result + numbers[index]) + dfs(numbers, target, index + 1, result - numbers[index])
        }
        return targetNumber
    }
}
