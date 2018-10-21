class CounterTest extends SparkTest {

  import testImplicits._

  test("count") {
    val df = Seq[(String, String, String)](("a", "b", null)).toDF("a", "b", "c")

    df.count() should be(1)
  }
}
