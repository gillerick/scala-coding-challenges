import algorithms.ValidParenthesis.validParenthesis
import org.scalatest.flatspec.AnyFlatSpec

class ValidParenthesisSuite extends AnyFlatSpec {
  "validParenthesis" should "correctly return true for a valid parenthesis" in {
    assert(validParenthesis("([])(){}(())()()"))
    assert(validParenthesis("()"))
  }

  it should "correctly return false for an invalid parenthesis" in {
    assert(!validParenthesis("(["))
    assert(!validParenthesis("(]"))
  }


}
