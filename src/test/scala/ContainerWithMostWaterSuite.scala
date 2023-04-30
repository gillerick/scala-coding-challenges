import munit.FunSuite
import containerWithMostWater.Solution

class ContainerWithMostWaterSuite extends FunSuite {
  test("a list containing values should return the maximum area") {
    assertEquals(Solution.containerWithMostWater(List(1, 8, 6, 2, 5, 4, 8, 3, 7)), 49)
    assertEquals(Solution.containerWithMostWater(List(1, 1)), 1)
    assertEquals(Solution.containerWithMostWater(List(1, 2, 1)), 2)
  }

  test("a list of no elements should return zero"){
    assertEquals(Solution.containerWithMostWater(List.empty[Int]), 0)

  }

}
