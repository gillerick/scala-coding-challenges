package algorithms

import scala.collection.mutable

object ValidParenthesis {
  def validParenthesis(stringInput: String): Boolean = {
    val stack = mutable.Stack[Char]()
    val brackets = Map('}' -> '{', ']' -> '[', ')' -> '(')
    for (character <- stringInput) {
      if (brackets.values.toSet.contains(character)) {
        stack.push(character)
      } else if (brackets.keys.toSet.contains(character)) {
        if (stack.isEmpty || stack.pop() != brackets(character)) {
          return false
        }
      }
    }
    stack.isEmpty
  }


}
