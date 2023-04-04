fun generateParenthesis(n: Int): List<String> {
    val res = ArrayList<String>()
    
    fun dfs(left: Int, right: Int, path: String) {
        if (right == n) {
            res.add(path)
            return
        }
        
        if (left < n) {
            dfs(left + 1, right, path + "(")
        }

        if (right < left) {
            dfs(left, right + 1, path + ")")
        }
    }
    
    dfs(0, 0, "")
    
    return res
}
