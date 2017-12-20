package gr.maenolis.solution

trait Solver[I, O] {
  def solve(input: I): O
}
