class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) return false
        val closeBracket = hashMapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        val validKeys = closeBracket.keys;
        var validStack = ArrayDeque<Char>()

        for (element in s) {
            if (validKeys.contains(element)) {
                validStack.addLast(element)
            } else {
                if (validStack.isEmpty()) return false;
                val charToCheck = validStack.removeLast()
                if (closeBracket.get(charToCheck) != element) return false
            }
        }

        return validStack.isEmpty()
    }
}
