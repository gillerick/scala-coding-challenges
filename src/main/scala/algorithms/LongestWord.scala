package algorithms

object LongestWord {
  def longestWord(sentence: String): String = {
    val words = sentence.split(" ").filter(_.forall(_.isLetter))
    words.maxBy(_.length)
  }

}
