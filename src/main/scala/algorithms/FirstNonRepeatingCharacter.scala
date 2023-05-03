package algorithms

object FirstNonRepeatingCharacter {
  def firstNonRepeatingCharacter(stringInput: String): Int = {
    for (i <- stringInput.indices) {
      if (stringInput.count(_ == stringInput(i)) == 1) {
        return i
      }
    }
    -1
  }

}
