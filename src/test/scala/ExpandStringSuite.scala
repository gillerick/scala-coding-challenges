import org.scalatest.flatspec.AnyFlatSpec
import algorithms.ExpandString.expandString
import org.scalatest.matchers.should.Matchers._

class ExpandStringSuite extends AnyFlatSpec {
  //  ToDo: Fix solution
  "expandString" should "correctly add multipliers and brackets for a string input" in {
    expandString("cdcd") should be("2[cd]")

  }

}
