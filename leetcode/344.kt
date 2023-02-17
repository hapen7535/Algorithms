class Solution {
    fun reverseString(s: CharArray): Unit {
      if(s.size>0){
        s.reverse()
        for (i in s){
          print(i)
        }
     }
    }
}
