import org.scalatest.flatspec.AnyFlatSpec
import algorithms.FirstNonRepeatingCharacter.{firstNonRepeatingCharacter, firstNonRepeatingCharacterFunctional}
import org.scalatest.matchers.should.Matchers._

class FirstNonRepeatingCharacter extends AnyFlatSpec {
  "FirstNonRepeatingCharacter" should "correctly return the first non repeating character in a string input" in {
    firstNonRepeatingCharacter("abcdcaf") should be(1)
    firstNonRepeatingCharacter("a") should be(0)
    firstNonRepeatingCharacter("abac") should be(1)
    firstNonRepeatingCharacter("faadabcbbebdf") should be(6)
    firstNonRepeatingCharacter("lmnopqldsafmnopqsa") should be(7)

  }

  "firstNonRepeatingCharacterHashMap" should "correctly return the first non repeating character in a string input" in {
    firstNonRepeatingCharacterFunctional("abcdcaf") should be(1)
    firstNonRepeatingCharacterFunctional("a") should be(0)
    firstNonRepeatingCharacterFunctional("abac") should be(1)
    firstNonRepeatingCharacterFunctional("faadabcbbebdf") should be(6)
    firstNonRepeatingCharacterFunctional("lmnopqldsafmnopqsa") should be(7)
  }

}
