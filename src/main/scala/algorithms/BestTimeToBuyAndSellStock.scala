package algorithms

object BestTimeToBuyAndSellStock {
  def bestTimeToBuyAndSellStock(prices: List[Int]): Int = {
    val n = prices.length
    var maximumProfit = 0
    for (i <- 0 until n) {
      var rightIdx = i + 1
      while (rightIdx < n) {
        val potentialProfit = prices(rightIdx) - prices(i)
        maximumProfit = Math.max(maximumProfit, potentialProfit)
        rightIdx += 1
      }
    }
    maximumProfit
  }

  def bestTimeToBuyAndSellStockKadane(prices: List[Int]): Int = {
    ???
  }

}
