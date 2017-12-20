package problems

import gr.maenolis.problem.ProblemSolution1
import org.scalatest.{FlatSpec, Matchers}

class SolverProblem1Test extends FlatSpec with Matchers {

  "Problem1" should "solve the first problem" in {
    val ps = ProblemSolution1(List(1,2,3,4,5))
    assert(ps.solve === 5)
  }

}
