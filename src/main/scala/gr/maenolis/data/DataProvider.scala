package gr.maenolis.data

trait DataProvider[I] {
  def getData: I
}

object DataProvider {
  def apply[I](data: I): DataProvider[I] = DataProviderImpl(data)
}

case class DataProviderImpl[I](data: I) extends DataProvider[I] {
  override def getData: I = data
}
