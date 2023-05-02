package algorithms

object MaximumSubarray {
  def maximumSubarrayKadane(nums: List[Int]): Int = {
    var maximumSum = nums.head
    var currentSum = 0
    for (number <- nums) {
      currentSum += number
      maximumSum = Math.max(maximumSum, currentSum)
      currentSum = Math.max(currentSum, 0)
    }
    maximumSum
  }

  def maximumSubarrayDp(nums: List[Int]): Int = {
    ???
  }

}
