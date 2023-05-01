import algorithms.LongestWord.longestWord
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class LongestWordSuite extends AnyFlatSpec {
  "longestWord" should "correctly return the longest word from a sentence of normal words" in {
    longestWord("I love dogs") should be("love")
    longestWord("fun&!! time") should be("time")
  }

  it should "ignore special characters and only count normal characters" in {
    longestWord("a beautiful sentence^&!") should be("beautiful")

  }

}
