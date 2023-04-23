class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        val list = arrayListOf<String>()

        for (num in i .. j) {
            if (num.toString().contains(k.toString())) {
                list.addAll(num.toString().split(""))
            }
        }

        return list.count { it == k.toString() }
    }
}
