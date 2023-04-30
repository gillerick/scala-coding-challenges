import munit.FunSuite
import algorithms.BestTimeToBuyAndSellStock

class BestTimeToBuyAndSellStock extends FunSuite {
  test("suboptimal solution") {
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(9, 8, 5, 4, 1)), 0)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(7, 1, 5, 3, 6, 4)), 5)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(7, 6, 4, 3, 1)), 0)
  }

}
