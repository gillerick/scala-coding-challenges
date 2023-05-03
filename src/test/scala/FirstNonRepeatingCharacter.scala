import org.scalatest.flatspec.AnyFlatSpec
import algorithms.FirstNonRepeatingCharacter.firstNonRepeatingCharacter
import org.scalatest.matchers.should.Matchers._

class FirstNonRepeatingCharacter extends AnyFlatSpec {
  "FirstNonRepeatingCharacter" should "correctly return the first non" in {
    firstNonRepeatingCharacter("abcdcaf") should be(1)
    firstNonRepeatingCharacter("a") should be(0)
    firstNonRepeatingCharacter("abac") should be(1)
    firstNonRepeatingCharacter("faadabcbbebdf") should be(6)
    firstNonRepeatingCharacter("lmnopqldsafmnopqsa") should be(7)

  }

}
