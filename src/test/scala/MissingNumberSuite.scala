import algorithms.MissingNumber.missingNumber
import munit.FunSuite

class MissingNumberSuite extends FunSuite {
  test("correctly return the missing number in a valid list") {
    assertEquals(missingNumber(List(0, 1, 3)), 2)
    assertEquals(missingNumber(List(9, 6, 4, 2, 3, 5, 7, 0, 1)), 8)
  }
  test("return 0 for an empty list") {
    assertEquals(missingNumber(List.empty), 0)

  }
  test("return 0 for a list with no missing number") {
    assertEquals(missingNumber(List(1, 2, 3)), 0)
  }

}
