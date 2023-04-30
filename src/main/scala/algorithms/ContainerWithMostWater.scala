package algorithms

object ContainerWithMostWater {
  def containerWithMostWater(height: List[Int]): Int = {
    var maximumArea = 0
    var leftIdx = 0
    var rightIdx = height.length - 1
    while (leftIdx < rightIdx) {
      val length = rightIdx - leftIdx
      val leftHeight = height(leftIdx)
      val rightHeight = height(rightIdx)
      val currentArea = length * Math.min(rightHeight, leftHeight)
      maximumArea = Math.max(currentArea, maximumArea)

      if (leftHeight > rightHeight) {
        rightIdx -= 1
      } else if (rightHeight > leftHeight) {
        leftIdx += 1
      } else {
        leftIdx += 1
        rightIdx -= 1
      }
    }
    maximumArea
  }

}
