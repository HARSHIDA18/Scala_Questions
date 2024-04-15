object PossibleNonRepeatingCombinationsSum extends App{
  def nonRepeatingCombinationsSum(candidates: Set[Int], target: Int): List[Set[Int]]={
    def helper(curr: Set[Int], remaining: Set[Int], acc: List[Set[Int]]):List[Set[Int]]={
      if (curr.sum==target) acc :+ curr
      else if (curr.sum < target && remaining.nonEmpty) {
        val newCurr = curr + remaining.head
        val newRemaining = remaining.tail
        val withHead = helper(newCurr, newRemaining, acc)
        val withoutHead = helper(curr, newRemaining, acc)
        withHead ++ withoutHead
      } else acc
    }
    helper(Set(), candidates, List()).map(_.toSet)
  }
    println("Enter the target:")
    val target = scala.io.StdIn.readInt()
    println("Enter the array of elements separated by space:")
    val candidatesInput = scala.io.StdIn.readLine()
    val candidates = candidatesInput.split(" ").map(_.toInt).toSet
    val result = nonRepeatingCombinationsSum(candidates, target)
    println("Combinations:")
    result.foreach(println)
}
