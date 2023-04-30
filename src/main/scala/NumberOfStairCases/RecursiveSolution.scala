package NumberOfStairCases

/*
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
Implement a method to count how many possible ways the child can run up the stairs.
* */
object RecursiveSolution {
  def numberOfStairCases(n: Int): Int = n match {
    case 0 => 1
    case i if i < 0 => 0
    case _ => numberOfStairCases(n - 1) + numberOfStairCases(n - 2) + numberOfStairCases(n - 3)
  }
}
