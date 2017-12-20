package gr.maenolis.problem

import gr.maenolis.data.DataProvider
import gr.maenolis.solution.Solver

object ProblemSolution2 {
  def apply(input: List[Int]): ProblemSolution[List[Int], Int] = new ProblemSolution2(DataProvider(input), new Problem2Solver[Int])
}

case class ProblemSolution2(dataProvider: DataProvider[List[Int]], solver: Solver[List[Int], Int]) extends ProblemSolution[List[Int], Int]

class Problem2Solver[Int] extends Solver[List[Int], Int] {
  override def solve(input: List[Int]) : Int = {
    if (input.lengthCompare(2) < 0) {
      throw new RuntimeException("Empty list is not allowed.")
    }
    input.apply(input.length - 2)
  }
}