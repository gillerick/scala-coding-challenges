import munit.FunSuite
import NumberOfStairCases.RecursiveSolution

class NumberOfStairCases extends FunSuite {
  test("number of stair cases - recursive solution") {
    assertEquals(RecursiveSolution.numberOfStairCases(1), 1)
    assertEquals(RecursiveSolution.numberOfStairCases(3), 4)
    assertEquals(RecursiveSolution.numberOfStairCases(10), 274)
  }

}
