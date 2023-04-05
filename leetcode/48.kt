class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size
        var i = 0
        var j = n - 1

        while (i < j) {
            val temp = matrix[i]
            matrix[i] = matrix[j]
            matrix[j] = temp
            i++
            j--
        }

        for (i in 0..n-1) {
            for (j in 0..i) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        
    }
}
