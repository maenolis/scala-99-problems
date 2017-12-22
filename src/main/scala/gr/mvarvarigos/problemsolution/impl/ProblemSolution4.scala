package gr.mvarvarigos.problemsolution.impl

import gr.mvarvarigos.problem.Problem
import gr.mvarvarigos.problemsolution.ProblemSolution
import gr.mvarvarigos.solution.Solution

object ProblemSolution4 {
  def apply[T](input: List[T]): ProblemSolution[List[T], Int] = new ProblemSolution4(input)
}

class ProblemSolution4[T](override val input: List[T]) extends ProblemSolution[List[T], Int]
  with Problem[List[T]]
  with Solution[List[T], Int] {

  override def description: String = "Return the length of a list."

  override def solveProblem(input: List[T]): Int = {
    input.length
  }
}
