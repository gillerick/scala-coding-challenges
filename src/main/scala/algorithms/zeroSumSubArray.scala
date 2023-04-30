package algorithms

object zeroSumSubArray {
  def isZeroSumSubArray(nums: List[Int]): Boolean = {
    var sums = Set(0)
    var currentSum = 0
    for (num <- nums) {
      currentSum += num
      if (sums.contains(currentSum)) {
        return true
      }
      sums += currentSum
    }
    false
  }

}
