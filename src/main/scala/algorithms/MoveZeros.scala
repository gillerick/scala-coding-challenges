package algorithms

object MoveZeros {
  def moveZeros(arr: List[Int]): List[Int] = {
    arr.filter(_ != 0) ++ arr.filter(_ == 0)
  }

}
