import algorithms.ContainerWithMostWater
import munit.FunSuite

class ContainerWithMostWaterSuite extends FunSuite {
  test("a list containing values should return the maximum area") {
    assertEquals(ContainerWithMostWater.containerWithMostWater(List(1, 8, 6, 2, 5, 4, 8, 3, 7)), 49)
    assertEquals(ContainerWithMostWater.containerWithMostWater(List(1, 1)), 1)
    assertEquals(ContainerWithMostWater.containerWithMostWater(List(1, 2, 1)), 2)
  }

  test("a list of no elements should return zero"){
    assertEquals(ContainerWithMostWater.containerWithMostWater(List.empty[Int]), 0)

  }

}
