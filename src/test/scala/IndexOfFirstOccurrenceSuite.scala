import algorithms.IndexOfFirstOccurrence.{indexOfFirstOccurrence, indexOfFirstOccurrenceFunctional}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class IndexOfFirstOccurrenceSuite extends AnyFlatSpec {
  "indexOfFirstOccurrence" should "correctly return the index of the occurrence of a substring in a given string" in {
    indexOfFirstOccurrence("sadbutsad", "sad") should be(0)
    indexOfFirstOccurrence("hello", "ll") should be(2)
    indexOfFirstOccurrence("randomstring", "boy") should be(-1)
  }

  "indexOfFirstOccurrenceFunctional" should "correctly return the index of the occurrence of a substring in a given string" in {
    indexOfFirstOccurrenceFunctional("sadbutsad", "sad") should be(0)
    indexOfFirstOccurrenceFunctional("hello", "ll") should be(2)
    indexOfFirstOccurrenceFunctional("randomstring", "boy") should be(-1)
  }

}
