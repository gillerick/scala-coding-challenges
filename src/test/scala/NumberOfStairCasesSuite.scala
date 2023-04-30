import algorithms.NumberOfStairCases.{numberOfStairCasesDp, numberOfStairCasesRecursive}
import munit.FunSuite

class NumberOfStairCasesSuite extends FunSuite {
  test("number of stair cases - recursive solution") {
    assertEquals(numberOfStairCasesRecursive(1), 1)
    assertEquals(numberOfStairCasesRecursive(3), 4)
    assertEquals(numberOfStairCasesRecursive(10), 274)
  }

  test("number of stair cases - dp solution") {
    assertEquals(numberOfStairCasesDp(1), 1)
    assertEquals(numberOfStairCasesDp(3), 4)
    assertEquals(numberOfStairCasesDp(10), 274)
  }

}
