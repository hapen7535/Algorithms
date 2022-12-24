class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
	    
        for(i in 0 until numRows){
            val layer = mutableListOf<Int>()
            for(j in 0 .. i){
                if(j == 0 || j == i){
                    layer.add(1)
                }
                else{
                    layer.add(result.last()[j-1] + result.last()[j])
                }
            }
            result.add(layer)
        }

	    return result
    }
}
