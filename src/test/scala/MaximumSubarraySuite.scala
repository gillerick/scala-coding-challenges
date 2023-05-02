import org.scalatest.flatspec.AnyFlatSpec
import algorithms.MaximumSubarray._
import org.scalatest.matchers.should.Matchers._

class MaximumSubarraySuite extends AnyFlatSpec {
  "maximumSubarrayKadane" should "correctly return the sum of the maximum subarray" in {
    maximumSubarrayKadane(List(-2, 1, -3, 4, -1, 2, 1, -5, 4)) should be(6)
    maximumSubarrayKadane(List(1)) should be(1)
    maximumSubarrayKadane(List(5, 4, -1, 7, 8)) should be(23)
  }

  "maximumSubarrayDp" should "correctly return the sum of the maximum subarray" in {
    maximumSubarrayDp(List(-2, 1, -3, 4, -1, 2, 1, -5, 4)) should be(6)
    maximumSubarrayDp(List(1)) should be(1)
    maximumSubarrayDp(List(5, 4, -1, 7, 8)) should be(23)
  }

  "maximumSubarrayFunctional" should "correctly return the sum of the maximum subarray" in {
    maximumSubarrayFunctional(List(-2, 1, -3, 4, -1, 2, 1, -5, 4)) should be(6)
    maximumSubarrayFunctional(List(1)) should be(1)
    maximumSubarrayFunctional(List(5, 4, -1, 7, 8)) should be(23)
  }

}
