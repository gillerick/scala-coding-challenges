import algorithms.RemoveDuplicates.removeDuplicates
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class RemoveDuplicatesSuite extends AnyFlatSpec {
  "removeDuplicates" should "correctly remove the duplicate elements in an array" in {
    removeDuplicates(List(1, 1, 2)) should be(List(1, 2))
    removeDuplicates(List(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)) should be(List(0, 1, 2, 3, 4))

  }

}
