package algorithms

object MoveElementToEnd {
  /*
   * This is an inplace solution which works without an additional array
   * Time complexity: O(n+m*count)
   */
  def moveElementToEndInPlace(array: List[Int], toMove: Int): List[Int] = {
    array.filter(_ != toMove) ++ array.filter(_ == toMove)
  }

  def moveElementToEndTwoPointer(array: Array[Int], toMove: Int): Array[Int] = {
    var leftIdx = 0
    var rightIdx = array.length - 1
    while (leftIdx < rightIdx) {
      val leftNum = array(leftIdx)
      val rightNum = array(rightIdx)
      if (leftNum == toMove && rightNum != toMove) {
        array(leftIdx) = rightNum
        array(rightIdx) = leftNum
        leftIdx += 1
        rightIdx -= 1
      } else if (rightNum == toMove) {
        rightIdx -= 1
      } else if (leftNum != toMove) {
        leftIdx += 1
      }
    }
    array
  }

}
