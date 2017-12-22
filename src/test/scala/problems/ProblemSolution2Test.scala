package problems

import gr.maenolis.problemsolution.ProblemSolution2
import org.scalatest.{FlatSpec, Matchers}

class ProblemSolution2Test extends FlatSpec with Matchers {

  "Problem2" should "solve the second problem" in {
    val ps = ProblemSolution2(List(1,2,3,4,5))
    assert(ps.solve === 4)
  }

}
