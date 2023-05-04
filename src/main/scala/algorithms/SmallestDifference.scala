package algorithms

import java.lang.Math.abs

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
      val current = abs(first - second)

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

  def smallestDifferenceFunctional(arrayOne: Array[Int], arrayTwo: Array[Int]): Array[Int] = {
    val sortedArrayOne = arrayOne.sorted
    val sortedArrayTwo = arrayTwo.sorted

    val smallestPair = sortedArrayOne.
      flatMap { first =>
        sortedArrayTwo.map {
          second =>
            (first, second, abs(first - second))
        }
      }.minBy(_._3)
    Array(smallestPair._1, smallestPair._2)
  }

}
