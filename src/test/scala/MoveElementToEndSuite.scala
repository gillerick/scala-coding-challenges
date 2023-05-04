import algorithms.MoveElementToEnd.moveElementToEndInPlace
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class MoveElementToEndSuite extends AnyFlatSpec {
  "moveElementToEndInPlace" should "correctly move the specified element to the end of the array" in {
    moveElementToEndInPlace(List(2, 1, 2, 2, 2, 3, 4, 2), 2) should be(List(1, 3, 4, 2, 2, 2, 2, 2))
    moveElementToEndInPlace(List.empty[Int], 6) should be(List.empty[Int])
    moveElementToEndInPlace(List(3, 3, 3, 3, 3, 3), 3) should be(List(3, 3, 3, 3, 3, 3))
    moveElementToEndInPlace(List(3, 1, 2, 4, 5), 3) should be(List(1, 2, 4, 5, 3))
  }

}
