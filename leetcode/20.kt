class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) return false

        val validKeys = CLOSE_BRACKET.keys;
        val validStack = ArrayDeque<Char>()

        for (element in s) {
            if (validKeys.contains(element)) {
                validStack.addLast(element)
            } else {
                if (validStack.isEmpty()) return false;
                val charToCheck = validStack.removeLast()
                if (CLOSE_BRACKET.get(charToCheck) != element) return false
            }
        }

        return validStack.isEmpty()
    }

    companion object {
        private val CLOSE_BRACKET: HashMap<Char, Char> = hashMapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )
    }

}
