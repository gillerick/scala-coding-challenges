import algorithms.ValidStartingCity.validStartingCityKadane
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class ValidStartingCitySuite extends AnyFlatSpec {
  "validStartingCity" should "return the correct starting city for a simple example" in {
    val distances = List(5, 25, 15, 10, 15)
    val fuel = List(1, 2, 1, 0, 3)
    val mpg = 10
    val expectedStartingCity = 4
    validStartingCityKadane(distances, fuel, mpg) should be(expectedStartingCity)
  }

  it should "return the correct starting city when there is no valid city" in {
    val distances = List(10, 20, 30, 40)
    val fuel = List(1, 2, 3, 4)
    val mpg = 5
    val expectedStartingCity = 0
    validStartingCityKadane(distances, fuel, mpg) should be(expectedStartingCity)
  }

  it should "return the correct starting city for a case with only one city" in {
    val distances = List(5)
    val fuel = List(1)
    val mpg = 5
    val expectedStartingCity = 0
    validStartingCityKadane(distances, fuel, mpg) should be(expectedStartingCity)
  }

  it should "return the correct starting city for a case with large inputs" in {
    val distances = List.fill(1000)(10)
    val fuel = List.fill(1000)(5)
    val mpg = 10
    val expectedStartingCity = 0
    val actualStartingCity = validStartingCityKadane(distances, fuel, mpg)
    actualStartingCity should be(expectedStartingCity)
  }

}
