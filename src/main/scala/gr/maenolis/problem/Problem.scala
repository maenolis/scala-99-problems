package gr.maenolis.problem

trait Problem[I] {

  def input: I

  def description: String
}
