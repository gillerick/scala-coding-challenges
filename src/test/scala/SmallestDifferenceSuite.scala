import algorithms.SmallestDifference.smallestDifferenceTwoPointer
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class SmallestDifferenceSuite extends AnyFlatSpec {
  "smallestDifference" should "correctly return the minimum difference between the array elements" in {
    smallestDifferenceTwoPointer(Array(-1, 5, 10, 20, 28, 3), Array(26, 134, 135, 15, 17)) should be(Array(28, 26))
  }

}
