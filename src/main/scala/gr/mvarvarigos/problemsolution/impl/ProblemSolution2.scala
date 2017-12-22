package gr.mvarvarigos.problemsolution.impl

import gr.mvarvarigos.problem.Problem
import gr.mvarvarigos.problemsolution.ProblemSolution
import gr.mvarvarigos.solution.Solution

object ProblemSolution2 {
  def apply[T](input: List[T]): ProblemSolution[List[T], T] = new ProblemSolution2(input)
}

class ProblemSolution2[T](override val input: List[T]) extends ProblemSolution[List[T], T]
  with Problem[List[T]]
  with Solution[List[T], T]
{

  override def description: String = "Return the last but one element of a list."

  override def solveProblem(input: List[T]): T = {
    if (input.lengthCompare(2) < 0) {
      throw new RuntimeException("Empty list is not allowed.")
    }
    input.apply(input.length - 2)
  }
}