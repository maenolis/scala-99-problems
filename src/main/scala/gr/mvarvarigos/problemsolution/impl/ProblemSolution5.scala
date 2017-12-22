package gr.mvarvarigos.problemsolution.impl

import gr.mvarvarigos.problem.Problem
import gr.mvarvarigos.problemsolution.ProblemSolution
import gr.mvarvarigos.solution.Solution

object ProblemSolution5 {
  def apply[T](input: List[T]): ProblemSolution[List[T], List[T]] = new ProblemSolution5(input)
}

class ProblemSolution5[T](override val input: List[T]) extends ProblemSolution[List[T], List[T]]
  with Problem[List[T]]
    with Solution[List[T], List[T]]{

  override def description: String = "Reverse a list."

  override def solveProblem(input: List[T]): List[T] = {
    input.reverse
  }
}
