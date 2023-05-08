package algorithms

object Pairs {
  def pairs(array: List[Int], k: Int): Int = {
    array.foldLeft(0)((count, number) => {
      if (array.contains(number + k)) count + 1 else count
    })
  }

}
