import org.apache.spark.sql.DataFrame

object Counter {
  def count(inputDf: DataFrame): Long =  {
    inputDf.count()
  }

}
