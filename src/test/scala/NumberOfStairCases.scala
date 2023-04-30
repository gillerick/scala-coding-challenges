import munit.FunSuite
import NumberOfStairCases.RecursiveSolution
import NumberOfStairCases.DpSolution

class NumberOfStairCases extends FunSuite {
  test("number of stair cases - recursive solution") {
    assertEquals(RecursiveSolution.numberOfStairCases(1), 1)
    assertEquals(RecursiveSolution.numberOfStairCases(3), 4)
    assertEquals(RecursiveSolution.numberOfStairCases(10), 274)
  }

  test("number of stair cases - dp solution") {
    assertEquals(DpSolution.numberOfStairCases(1), 1)
    assertEquals(DpSolution.numberOfStairCases(3), 4)
    assertEquals(DpSolution.numberOfStairCases(10), 274)
  }

}
