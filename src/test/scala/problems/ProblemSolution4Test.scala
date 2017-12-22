package problems

import gr.maenolis.problemsolution.ProblemSolution4
import org.scalatest.{FlatSpec, Matchers}

class ProblemSolution4Test extends FlatSpec with Matchers {

  "Problem4" should "return the length of a list" in {
    val ps = ProblemSolution4(List(1,2,3,4,5))
    assert(ps.solve === 5)
  }

  it should "accept empty lists" in {
    val ps = ProblemSolution4(List())
    assert(ps.solve === 0)
  }

}
