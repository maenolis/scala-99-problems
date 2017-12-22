package gr.maenolis.solution

trait Solution[I, O] {
  def solveProblem(input: I): O
}
