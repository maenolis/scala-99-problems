package gr.maenolis.problemsolution

import gr.maenolis.problem.Problem
import gr.maenolis.solution.Solution

object ProblemSolution3 {
  def apply[T](input: (Int, List[T])): ProblemSolution[(Int, List[T]), T] = new ProblemSolution3(input)

}

class ProblemSolution3[T](override val input: (Int, List[T])) extends ProblemSolution[(Int, List[T]), T]
  with Problem[(Int, List[T])] with Solution[(Int, List[T]), T] {

  override def description: String = "Return the k-th element of a list."

  override def solve(input: (Int, List[T])): T = {
    require(input._1 > 0, "Only positive non-zero numbers are allowed")
    require(input._2.lengthCompare(input._1) >= 0, "Insufficient list length")

    input._2.apply(input._1 - 1)
  }
}