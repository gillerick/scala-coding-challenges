package algorithms

/*
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
Implement a method to count how many possible ways the child can run up the stairs.
* */
object NumberOfStairCases {
  def numberOfStairCasesRecursive(n: Int): Int = n match {
    case 0 => 1
    case i if i < 0 => 0
    case _ => numberOfStairCasesRecursive(n - 1) + numberOfStairCasesRecursive(n - 2) + numberOfStairCasesRecursive(n - 3)
  }

  def numberOfStairCasesDp(n: Int): Int = {
    /*This is a helper function that dynamically counts the number of ways to climb the stair cases*/
    def countWays(n: Int, memo: Array[Int]): Int = n match {
      case 0 => 1
      case i if i < 0 => 0
      case i if memo(i) > -1 => memo(i)
      case _ =>
        memo(n) = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo)
        memo(n)
    }

    //    Initializing the memo with -1s
    val memo = Array.fill(n + 1)(-1)
    countWays(n, memo)
  }
}
