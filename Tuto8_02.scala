object Tuto8_02 {
  def main(args: Array[String]): Unit = {
    object PatternMatchingExample {
      def main(args: Array[String]): Unit = {
        print("Enter an integer: ")
        val input = scala.io.StdIn.readInt()

        val checkNumber: Int => String = {
          case n if n < 0 => "Negative"
          case 0 => "Zero"
          case n if n % 2 == 0 => "Even"
          case n if n % 2 != 0 => "Odd"
        }

        val result = checkNumber(input)
        println(s"$result is input")
      }
    }

  }

}
