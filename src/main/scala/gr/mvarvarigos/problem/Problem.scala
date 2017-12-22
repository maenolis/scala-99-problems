package gr.mvarvarigos.problem

trait Problem[I] {

  def input: I

  def description: String
}
