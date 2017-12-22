package problems

import gr.maenolis.problemsolution.ProblemSolution3
import org.scalatest.{FlatSpec, Matchers}

class ProblemSolution3Test extends FlatSpec with Matchers {

  "Problem3" should "return the k-th object in a list" in {
    val ps = ProblemSolution3((3, List(1,2,3,4,5)))
    assert(ps.solve === 3)
  }

  it should "return only the k-th object in a list" in {
    val ps = ProblemSolution3((3, List(1,2,3,4,5)))
    assert(ps.solve !== 5)
  }

  it should "throw exception for negative number" in {
    val ex = intercept[IllegalArgumentException] {
      val ps = ProblemSolution3((-3, List(1,2,3,4,5)))
      assert(ps.solve !== 5)
    }

    assert(ex.getMessage.contains("positive"))

  }

}
