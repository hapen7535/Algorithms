//Brute Force

class Solution {
  fun twoSum(nums : IntArray, num : Int) : IntArray {
    (nums.indices).forEach { i ->
      for ( j in i + 1 until nums.size) {
        if ( nums[i] + nums[j] == num)
          return intArrayOf(i,j)
      }
    }
    return intArrayOf(0,0) //아무것도 없음
  }
}
