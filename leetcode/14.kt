class Solution{
  fun longestCommonPrefix(strs : Array<String>): String{
    var prefix : String = strs[0]
    for(index in 1 until strs.size){
      while(strs.get(index).indexOf(prefix) != 0){
        prefix = prefix.substring(0, prefix.length - 1)  
      }
    }
    return prefix
  }
}
