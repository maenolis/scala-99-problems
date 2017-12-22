package gr.maenolis.solution

trait Solution[I, O] {
  def solve(input: I): O
}
