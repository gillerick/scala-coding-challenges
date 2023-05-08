import org.scalatest.flatspec.AnyFlatSpec
import algorithms.Pairs.pairs
import org.scalatest.matchers.should.Matchers._

class PairsSuite extends AnyFlatSpec {
  "pairs" should "correctly return the number of array pairs that add up to a specified integer" in {
    pairs(List(1, 3, 5, 8, 6, 4, 2), 2) should be(5)
    pairs(List(1, 5, 3, 4, 2), 2) should be(3)
    pairs(List(363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635,
      491595254, 879792181, 1069262793), 1) should be(0)
  }

}
