package algorithms

object MoveElementToEnd {
  /*
   * This is an inplace solution which works without an additional array
   * Time complexity: O(n+m*count)
   */
  def moveElementToEndInPlace(array: List[Int], toMove: Int): List[Int] = {
    array.filter(_ != toMove) ++ array.filter(_ == toMove)
  }

}
