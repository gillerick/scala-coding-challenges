package algorithms

object SmallestDifference {
  def smallestDifferenceTwoPointer(arrayOne: Array[Int], arrayTwo: Array[Int]): Array[Int] = {
    arrayOne.sortInPlace()
    arrayTwo.sortInPlace()

    var smallest = Int.MaxValue
    var smallestPair = Array.emptyIntArray

    var indexOne = 0
    var indexTwo = 0

    while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
      val first = arrayOne(indexOne)
      val second = arrayTwo(indexTwo)
      val current = Math.abs(first - second)

      if (current < smallest) {
        smallest = current
        smallestPair = Array(first, second)
      }

      if (first > second) {
        indexTwo += 1
      } else {
        indexOne += 1
      }
    }
    smallestPair
  }

}
