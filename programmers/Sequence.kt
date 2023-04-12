class Solution {
    fun solution(emergency: IntArray): IntArray {
        val emergencyList = emergency.copyOf()
        emergencyList.sortDescending()
        for (i in emergencyList.indices) {
            emergency[i] = emergencyList.indexOf(emergency[i]) + 1
        }

        return emergency
    }
}
