package gr.maenolis.problemsolution

import gr.maenolis.problem.Problem
import gr.maenolis.solution.Solution

object ProblemSolution1 {
  def apply[T](input: List[T]): ProblemSolution[List[T], T] = new ProblemSolution1(input)
}

class ProblemSolution1[T](override val input: List[T])
  extends ProblemSolution[List[T], T]
    with Problem[List[T]]
    with Solution[List[T], T] {

  override def description: String = "Return the last element of a list."

  override def solve(input: List[T]): T = {
    input.headOption.getOrElse(throw new RuntimeException("Empty list is not allowed."))
    input.last
  }

}