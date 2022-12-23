class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        nums2.forEachIndexed {index, value ->
   			nums1[m + index] = value
   		}
   		nums1.sort()
    }
}
