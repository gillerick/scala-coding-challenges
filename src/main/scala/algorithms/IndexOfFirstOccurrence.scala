package algorithms

object IndexOfFirstOccurrence {
  def indexOfFirstOccurrence(haystack: String, needle: String): Int = {
    val n = haystack.length

    if (n == 0) {
      return -1
    } else if (haystack.equals(needle)) {
      return 0
    }

    for (_ <- 0 until n) {
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

  def indexOfFirstOccurrenceFunctional(haystack: String, needle: String): Int = {
    val n = haystack.length

    if (n == 0) return -1 else if (haystack == needle) return 0

    val indices = (0 until n).toList.filter(i => haystack.slice(i, i + needle.length) == needle)
    if (indices.isEmpty) -1 else indices.head
  }


}
