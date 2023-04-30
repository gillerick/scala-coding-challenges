package NumberOfStairCases

object DpSolution {
  def numberOfStairCases(n: Int): Int = {
    /*This is a helper function that dynamically counts the number of ways to climb the stair cases*/
    def countWays(n: Int, memo: Array[Int]): Int = {
      if (n < 0) {
        0
      } else if (n == 0) {
        1
      } else if (memo(n) > -1) {
        memo(n)
      } else {
        memo(n) = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo)
        memo(n)
      }
    }

    //    Initializing the memo with -1s
    val memo = Array.fill(n + 1)(-1)
    countWays(n, memo)
  }

}
