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

  /*
  This code first creates a map of character frequencies using the groupBy and mapValues methods.
  It then iterates over each character in the input string using the foldLeft method.
  If the current character has a frequency of 1 and no previous non-repeating character has been found,
  it returns the index of that character using the indexOf method. Otherwise, it returns the previous result
  */
  def firstNonRepeatingCharacterFunctional(stringInput: String): Int = {
    val frequencies = stringInput.groupBy(identity).view.mapValues(_.length)
    stringInput.foldLeft(-1)((index, character) => {
      if (frequencies(character) == 1 && index == -1) {
        stringInput.indexOf(character)
      } else {
        index
      }
    })
  }

}
