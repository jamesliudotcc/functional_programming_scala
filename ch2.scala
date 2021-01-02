object MyModule {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fib(n: Int): Int = {
    def go(n: Int, last: Int, last_last: Int): Int =
      if (n == 0) 0
      else if (n == 1) last + last_last
      else go(n - 1, last + last_last, last)

    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))
  }
}
