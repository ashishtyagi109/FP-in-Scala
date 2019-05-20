object TwoDotOne extends App {
  println(fib(40))

  def fib(n: Int): Int = {
    def go(n: Int, idx: Int, prev1: Int, prev2: Int): Int = {
      if (idx == n) prev1 + prev2
      else go(n, idx+1, prev2, prev1 + prev2)
    }

    if (n == 0) 0
    else if (n == 1) 1
    else go(n, 2, 0, 1)
  }
}
