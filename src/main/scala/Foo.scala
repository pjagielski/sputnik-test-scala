package pl.touk.sputnik.scala.example

object Foo {
  def main(args: Array[String]) {
    println("Test of sputnik with scalastyle")
  }

  private def returnUnsafe: Int = {
    if (true) {
      return 20
    } else {
      return 42
    }
  }

  private def optionGetBadPractise: Int = {
    val o = Option(42)
    if (o.isDefined) {
      o.get
    } else {
      50
    }
  }

  def magicNumberBadPractise: Unit = {
    var foo = 4345
  }
}
