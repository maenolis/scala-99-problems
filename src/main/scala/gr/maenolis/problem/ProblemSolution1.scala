package gr.maenolis.problem

import gr.maenolis.data.DataProvider
import gr.maenolis.solution.Solver

object ProblemSolution1 {
  def apply(input: List[Int]): ProblemSolution[List[Int], Int] = new ProblemSolution1(DataProvider(input), new Problem1Solver[Int])
}

case class ProblemSolution1(dataProvider: DataProvider[List[Int]], solver: Solver[List[Int], Int]) extends ProblemSolution[List[Int], Int]

class Problem1Solver[Int] extends Solver[List[Int], Int] {
  override def solve(input: List[Int]) : Int = {
    input.headOption.getOrElse(throw new RuntimeException("Empty list is not allowed."))
    input.last
  }
}