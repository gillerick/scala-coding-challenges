import munit.FunSuite
import algorithms.BestTimeToBuyAndSellStock

class BestTimeToBuyAndSellStock extends FunSuite {
  test("Suboptimal solution") {
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(9, 8, 5, 4, 1)), 0)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(7, 1, 5, 3, 6, 4)), 5)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(List(7, 6, 4, 3, 1)), 0)
  }

  test("Kadane's algorithm solution") {
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStockKadane(List(9, 8, 5, 4, 1)), 0)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStockKadane(List(7, 1, 5, 3, 6, 4)), 5)
    assertEquals(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStockKadane(List(7, 6, 4, 3, 1)), 0)
  }


}
