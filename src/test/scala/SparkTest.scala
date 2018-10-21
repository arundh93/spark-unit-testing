import org.apache.spark.sql.QueryTest
import org.apache.spark.sql.test.SharedSparkSession
import org.scalatest.Matchers

abstract class SparkTest extends QueryTest with SharedSparkSession with Matchers {}
