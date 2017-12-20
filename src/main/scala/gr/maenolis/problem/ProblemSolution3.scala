package gr.maenolis.problem

import gr.maenolis.data.DataProvider
import gr.maenolis.solution.Solver

object ProblemSolution3 {
  def apply(input: (Int, List[Int])): ProblemSolution[(Int, List[Int]), Int] = new ProblemSolution3(DataProvider(input), new Problem3Solver())
}

case class ProblemSolution3(dataProvider: DataProvider[(Int, List[Int])], solver: Solver[(Int, List[Int]), Int]) extends ProblemSolution[(Int, List[Int]), Int]

class Problem3Solver extends Solver[(Int, List[Int]), Int] {
  override def solve(tuple: (Int, List[Int])) : Int = {
    require(tuple._1 > 0, "Only positive non-zero numbers are allowed")
    require(tuple._2.lengthCompare(tuple._1) >= 0, "Insufficient list length")

    tuple._2.apply(tuple._1 - 1)
  }
}