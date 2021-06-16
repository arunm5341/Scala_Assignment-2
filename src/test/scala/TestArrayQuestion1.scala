import org.scalatest.funsuite.AnyFunSuite

class TestArrayQuestion1 extends AnyFunSuite {
  test("ArrayQuestion1") {
    assert(ArrayQuestion1.nextGreatest(arr = Array(9, 5, 8, 4, -10, 21, 6, 17, 11)) === Array(11, 11, 11, 11, 11, -1, 11, -1, -1))
  }
}
