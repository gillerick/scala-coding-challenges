import algorithms.zeroSumSubArray
import munit.FunSuite

class ZeroSumSubArraySuite extends FunSuite {
  test("An empty subarray should return false") {
    assert(!zeroSumSubArray.isZeroSumSubArray(List.empty[Int]))
  }

  test("An array comprising only zeros should return true") {
    assert(zeroSumSubArray.isZeroSumSubArray(List(0)))
    assert(zeroSumSubArray.isZeroSumSubArray(List(0, 0, 0)))
  }

  test("An array with no subarray adding to zero") {
    assert(!zeroSumSubArray.isZeroSumSubArray(List(1, 1, 1)))
    assert(!zeroSumSubArray.isZeroSumSubArray(List(-1, -1, -1)))
    assert(!zeroSumSubArray.isZeroSumSubArray(List(1, 2, 3)))
  }

  test("An array with subarray adding to zero") {
    assert(zeroSumSubArray.isZeroSumSubArray(List(1, 2, 3, 4, 0, 5, 6, 7)))
    assert(zeroSumSubArray.isZeroSumSubArray(List(2, -2)))
  }

}
