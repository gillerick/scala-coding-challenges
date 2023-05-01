package algorithms

object MissingNumber {
  def missingNumber(nums: List[Int]): Int = {
    /*Handle base case*/
    if (nums.isEmpty) return 0

    for (i <- 0 until nums.max) {
      if (!nums.contains(i)) {
        return i
      }
    }
    0
  }

}
