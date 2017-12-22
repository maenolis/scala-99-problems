package gr.mvarvarigos.problemsolution

import gr.mvarvarigos.problem.Problem
import gr.mvarvarigos.solution.Solution

trait ProblemSolution[I, O] {

  self: Problem[I]
    with Solution[I, O] =>
  def solve: O = solveProblem(input)

  def description: String

}
