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
    var maximumProfit = 0
    var minimumBuy = prices.head
    for (price <- prices) {
      minimumBuy = Math.min(minimumBuy, price)
      val currentProfit = price - minimumBuy
      maximumProfit = Math.max(currentProfit, maximumProfit)
    }
    maximumProfit
  }

}
