import algorithms.SmallestDifference.{smallestDifferenceFunctional, smallestDifferenceTwoPointer}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class SmallestDifferenceSuite extends AnyFlatSpec {
  "smallestDifference" should "correctly return the pair with the minimum difference for a given array" in {
    smallestDifferenceTwoPointer(Array(-1, 5, 10, 20, 28, 3), Array(26, 134, 135, 15, 17)) should be(Array(28, 26))
  }

  "smallestDifferenceFunctional" should "correctly return the pair with the minimum difference for a given array" in {
    smallestDifferenceFunctional(Array(-1, 5, 10, 20, 28, 3), Array(26, 134, 135, 15, 17)) should be(Array(28, 26))
  }

}
