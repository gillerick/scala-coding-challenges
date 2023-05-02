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
    val n = nums.length
    val dp = Array.fill(n)(0)
    dp(0) = nums.head
    var maximumSum = nums.head
    for (i <- 1 until n) {
      dp(i) = Math.max(dp(i - 1) + nums(i), nums(i))
      maximumSum = Math.max(maximumSum, dp(i))

    }
    maximumSum
  }

}
