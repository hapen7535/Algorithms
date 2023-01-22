class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if(rowIndex == 0) return listOf(1)

        val rows = Array(rowIndex + 1){ mutableListOf<Int>() }
        
        rows[0] = mutableListOf(1)
        rows[1] = mutableListOf(1,1)

        for(idx in 2..rowIndex){
            val rowArr = mutableListOf<Int>()
            rowArr.add(1)

            var current = 1
            for(i in 1..rows[idx - 1].size - 1){
                rowArr.add(current + rows[idx - 1][i])
                current = rows[idx - 1][i]
            }

            rowArr.add(1)
            rows[idx] = rowArr
        }

        return rows[rowIndex]
    }
}
