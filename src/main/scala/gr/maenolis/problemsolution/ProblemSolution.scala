package gr.maenolis.problemsolution

import gr.maenolis.problem.Problem
import gr.maenolis.solution.Solution

trait ProblemSolution[I, O] {

  self: Problem[I]
    with Solution[I, O] =>
  def solve: O = solve(input)

  def description: String

}
