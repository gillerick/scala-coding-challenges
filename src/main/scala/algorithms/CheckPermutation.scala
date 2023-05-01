package algorithms

object CheckPermutation {
  def checkPermutation(s1: String, s2: String): Boolean = {
    var letters = Map.empty[Char, Int].withDefaultValue(0)
    if (s1.length != s2.length) {
      return false
    }

    for (character <- s1) {
      letters += (character -> (letters(character) + 1))
    }

    for (character <- s2) {
      letters += (character -> (letters(character) - 1))
      if (letters(character) < 0) {
        return false
      }
    }
    true
  }

  def checkPermutationFunctional(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) return false

    s1.groupMapReduce(identity)(_ => 1)((i, j) => i + j) == s2.groupMapReduce(identity)(_ => 1)((i, j) => i + j)

  }

  def checkPermutationFunctional2(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      val letters = s1.foldLeft(Map.empty[Char, Int].withDefaultValue(0)) {
        case (map, char) => map + (char -> (map(char) + 1))
      }
      s2.foldLeft((true, letters)) {
        case ((result, map), char) =>
          val count = map(char) - 1
          (result && count >= 0, map + (char -> count))
      }._1
    }
  }

}
