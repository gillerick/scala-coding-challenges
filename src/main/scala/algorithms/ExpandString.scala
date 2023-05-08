package algorithms

object ExpandString {

  def expandString(inputString: String): String = {
    val stack = scala.collection.mutable.Stack[Any]()
    var i = 0
    while (i < inputString.length) {
      if (inputString(i).isDigit) {
        var num = ""
        while (inputString(i).isDigit) {
          num += inputString(i)
          i += 1
        }
        stack.push(num.toInt)
      } else if (inputString(i) == '[') {
        stack.push(i)
        i += 1
      } else if (inputString(i) == ']') {
        val startIndex = stack.pop().asInstanceOf[Int]
        val repeatString = inputString.substring(startIndex + 1, i)
        val num = stack.pop().asInstanceOf[Int]
        val expandedString = new StringBuilder
        for (_ <- 0 until num) {
          expandedString.append(repeatString)
        }
        stack.push(expandedString.toString())
        i += 1
      } else {
        stack.push(inputString(i).toString)
        i += 1
      }
    }
    stack.mkString("")
  }


}
