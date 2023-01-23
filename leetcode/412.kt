class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val answer = ArrayList<String>()
        for(i in 1..n){
            if(i % FIZZ_NUMBER == 0 && i % BUZZ_NUMBER == 0){
                answer.add("FizzBuzz")
            }
            else if(i % FIZZ_NUMBER == 0){
                answer.add("Fizz")
            }
            else if(i % BUZZ_NUMBER == 0){
                answer.add("Buzz")
            }
            else{
                answer.add(i.toString()) //"$i"
            }
            }
         return answer
        }
    companion object{
        const val FIZZ_NUMBER = 3
        const val BUZZ_NUMBER = 5
    }
} 
