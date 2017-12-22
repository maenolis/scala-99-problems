package problems

import gr.maenolis.problemsolution.ProblemSolution1
import org.scalatest.{FlatSpec, Matchers}

class ProblemSolution1Test extends FlatSpec with Matchers {

  "Problem1" should "solve the first problem" in {
    val ps = ProblemSolution1(List(1,2,3,4,5))
    assert(ps.solve === 5)
  }

}
