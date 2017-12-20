package gr.maenolis.problem

import gr.maenolis.data.DataProvider
import gr.maenolis.solution.Solver

trait ProblemSolution[I, O] {

  def solver: Solver[I, O]

  def dataProvider: DataProvider[I]

  final def solve: O = solver.solve(dataProvider.getData)

}
