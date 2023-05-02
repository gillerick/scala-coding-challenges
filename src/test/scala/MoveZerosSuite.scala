import org.scalatest.flatspec.AnyFlatSpec
import algorithms.MoveZeros._
import org.scalatest.matchers.should.Matchers._

class MoveZerosSuite extends AnyFlatSpec {
  "moveZeros" should "correctly move 0's in an array" in {
    moveZeros(List(0, 1, 0, 3, 12)) should be(List(1, 3, 12, 0, 0))
  }

  it should "return the original array if it contains no 0's" in {
    moveZeros(List(6, 8, 9)) should be(List(6, 8, 9))
  }

  it should "return the original array if it only contains 0's" in {
    moveZeros(List(0, 0, 0, 0)) should be(List(0, 0, 0, 0))
  }


}
