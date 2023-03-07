class Solution{
  fun intersect(nums1: IntArray, nums2: IntArray): IntArray{
    val count = IntArray(1001) //정적
  
    for(num in nums1) count[num]++
    
    val arr = ArrayList<Int>() //동적
    for(num in nums2){
      if(count[num] > 0){
        arr.add(num)
        count[num]--
      }
    }
    return arr.toIntArray()
  }
}
