package problems

import gr.maenolis.problemsolution.ProblemSolution5
import org.scalatest.{FlatSpec, Matchers}

class ProblemSolution5Test extends FlatSpec with Matchers {

  "Problem5" should "return a reversed list" in {
    val ps = ProblemSolution5(List(1, 2, 3, 4, 5))
    assert(ps.solve === List(5, 4, 3, 2, 1))
  }

  it should "accept empty lists" in {
    val ps = ProblemSolution5(List())
    assert(ps.solve === List())
  }

}
