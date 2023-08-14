object Tuto8_01 {
  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = depositAmount => depositAmount match {
      case amount if amount <= 20000 => 0.02 * amount
      case amount if amount <= 200000 => 0.04 * amount
      case amount if amount <= 2000000 => 0.035 * amount
      case amount => 0.065 * amount
    }

    // Test the function
    def main(args: Array[String]): Unit = {
      print("Enter the deposit amount: ")
      val deposit = scala.io.StdIn.readDouble()
      val interest = calculateInterest(deposit)
      println(f"The interest earned on Rs. $deposit%.2f deposit is Rs. $interest%.2f")
    }

  }

}
