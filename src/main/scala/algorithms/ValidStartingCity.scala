package algorithms

object ValidStartingCity {
  def validStartingCityKadane(distances: List[Int], fuel: List[Int], mpg: Int): Int = {
    val cities = distances.length
    var largestNegativeDistance = 0
    var bestStartingCityIndex = 0
    var currentDistanceSum = 0

    for (currentCityIndex <- 0 until cities) {
      val distanceToNextCity = distances(currentCityIndex)
      val fuelFromCurrentCity = fuel(currentCityIndex)
      currentDistanceSum += fuelFromCurrentCity * mpg - distanceToNextCity
      if (largestNegativeDistance > currentDistanceSum) {
        largestNegativeDistance = currentDistanceSum
        bestStartingCityIndex = (currentCityIndex + 1) % cities
      }
    }
    bestStartingCityIndex
  }

}
