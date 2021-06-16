import org.scalatest.funsuite.AnyFunSuite

class TestListsQuestion4 extends AnyFunSuite{
test("ListsQuestion4") {
  assert(ListsQuestion4.absolute(list = List(1, -2, -3, 4, -5, -6))===List(1,2,3,4,5,6))
}
}
