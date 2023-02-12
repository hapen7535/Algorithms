import java.util.Stack

class Solution {
    fun solution(number: String, k: Int): String {
        var answer = ""
        
        var kCnt = k
        val numberStack : Stack<Char> = Stack()
        var numArray = CharArray(number.length-k)

        number.forEach {
            while (numberStack.isNotEmpty() && numberStack.peek() < it && kCnt != 0){
                numberStack.pop()
                kCnt--
            }
            numberStack.push(it)
        }

        for (i in 0 until kCnt){
            numberStack.pop()
        }

        numberStack.forEachIndexed { index, n ->
            numArray[index] = n
        }

        return String(numArray)
    }
}
