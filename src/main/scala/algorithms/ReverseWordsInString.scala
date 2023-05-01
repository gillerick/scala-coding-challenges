package algorithms

object ReverseWordsInString {
  def reverseWords(string: String): String = {
    var stringArray = string.split("\\s")
    var leftIdx = 0
    var rightIdx = stringArray.length - 1
    while (leftIdx < rightIdx) {
      val reversedStringArray = stringArray.updated(leftIdx, stringArray(rightIdx)).updated(rightIdx, stringArray(leftIdx))
      leftIdx += 1
      rightIdx -= 1
      stringArray = reversedStringArray
    }
    stringArray.mkString(" ")
  }

}
