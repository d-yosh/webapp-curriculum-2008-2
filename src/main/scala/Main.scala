object Main {
  implicit class CamelString(val src: String) {
    def toCamelCase: String = {
        src.split(" ").foldLeft("") {
          (b, a) => {
            b + a.head.toUpper + a.tail
          }
        }
    }
  }

  def main(args: Array[String]): Unit = {
    println("my name is taro".toCamelCase)
  }
}
