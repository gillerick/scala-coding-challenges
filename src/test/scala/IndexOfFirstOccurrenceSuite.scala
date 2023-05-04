import algorithms.IndexOfFirstOccurrence.indexOfFirstOccurrence
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class IndexOfFirstOccurrenceSuite extends AnyFlatSpec {
  "indexOfFirstOccurrence" should "correctly return the index of the occurrence of a substring in a given string" in {
    indexOfFirstOccurrence("sadbutsad", "sad") should be(0)
    indexOfFirstOccurrence("hello", "ll") should be(2)
    indexOfFirstOccurrence("randomstring", "boy") should be(-1)
  }

}
