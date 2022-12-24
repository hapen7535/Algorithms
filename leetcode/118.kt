class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
	    repeat(numRows) { depth ->
		result.add(MutableList(depth + 1) { i ->
			when (i) {
				0, depth -> 1
				else -> result[depth - 1][i - 1] + result[depth - 1][i]
			    }
		    })
	    }
	    return result
    }
}
