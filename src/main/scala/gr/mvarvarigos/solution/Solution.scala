package gr.mvarvarigos.solution

trait Solution[I, O] {
  def solveProblem(input: I): O
}
