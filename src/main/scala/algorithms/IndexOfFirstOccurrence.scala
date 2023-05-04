package algorithms

object IndexOfFirstOccurrence {
  def indexOfFirstOccurrence(haystack: String, needle: String): Int = {
    val n = haystack.length

    if (n == 0) {
      return -1
    } else if (haystack.equals(needle)) {
      return 0
    }

    for (i <- 0 until n) {
      var pivot = 0
      while (pivot < n) {
        val potentialNeedle = haystack.slice(pivot, pivot + needle.length)
        if (potentialNeedle == needle) {
          return pivot
        } else {
          pivot += 1
        }
      }
    }
    -1
  }


}
