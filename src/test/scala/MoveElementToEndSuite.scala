import algorithms.MoveElementToEnd.{moveElementToEndInPlace, moveElementToEndTwoPointer}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class MoveElementToEndSuite extends AnyFlatSpec {
  "moveElementToEndInPlace" should "correctly move the specified element to the end of the array" in {
    moveElementToEndInPlace(List(2, 1, 2, 2, 2, 3, 4, 2), 2) should be(List(1, 3, 4, 2, 2, 2, 2, 2))
    moveElementToEndInPlace(List.empty[Int], 6) should be(List.empty[Int])
    moveElementToEndInPlace(List(3, 3, 3, 3, 3, 3), 3) should be(List(3, 3, 3, 3, 3, 3))
    moveElementToEndInPlace(List(3, 1, 2, 4, 5), 3) should be(List(1, 2, 4, 5, 3))
  }

  "moveElementToEndTwoPointer" should "correctly move the specified element to the end of the array" in {
    moveElementToEndTwoPointer(Array(2, 1, 2, 2, 2, 3, 4, 2), 2) should be(List(4, 1, 3, 2, 2, 2, 2, 2))
    moveElementToEndTwoPointer(Array.empty[Int], 6) should be(List.empty[Int])
    moveElementToEndTwoPointer(Array(3, 3, 3, 3, 3, 3), 3) should be(List(3, 3, 3, 3, 3, 3))
    moveElementToEndTwoPointer(Array(3, 1, 2, 4, 5), 3) should be(List(5, 1, 2, 4, 3))
  }

}
