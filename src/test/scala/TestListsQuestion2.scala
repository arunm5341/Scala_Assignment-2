import org.scalatest.funsuite.AnyFunSuite

class TestListsQuestion2 extends AnyFunSuite{
  test("ListsQuestion2") {
    assert(ListsQuestion2.oddValues(list = List(1,2,43,54,56))===List(2,54))
  }

}
