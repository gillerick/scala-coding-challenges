import munit.FunSuite
import algorithms.CheckPermutation

class CheckPermutationSuite extends FunSuite {
  test("correctly return true for strings which are permutations") {
    assert(CheckPermutation.checkPermutation("drool", "drool"))
    assert(CheckPermutation.checkPermutationFunctional("drool", "drool"))
    assert(CheckPermutation.checkPermutation("678", "768"))
    assert(CheckPermutation.checkPermutationFunctional("678", "768"))
  }

  test("correctly return false for non-permutation strings") {
    assert(!CheckPermutation.checkPermutation("boy", "girl"))
    assert(!CheckPermutation.checkPermutationFunctional("boy", "girl"))
  }

}
