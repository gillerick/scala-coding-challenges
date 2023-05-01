import org.scalatest.flatspec.AnyFlatSpec
import algorithms.ReverseWordsInString.reverseWords
import org.scalatest.matchers.should.Matchers._

class ReverseWordsInStringSuite extends AnyFlatSpec {
  "reverseWordsInString" should "correctly reverse a string without whitespace" in {
    reverseWords("the sky is blue") should be("blue is sky the")
    reverseWords("hello world") should be("world hello")
  }

  "reverseWordsInString" should "correctly ignore the white spaces in a string" in {
    //    ToDo: Check later
    reverseWords(" hello world ") should be("world hello ")
  }

}
