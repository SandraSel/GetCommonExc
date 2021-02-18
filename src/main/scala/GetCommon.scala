object GetCommon extends App{
  def getCommonElements(s1: Seq[Int], s2: Seq[Int], s3: Seq[Int]): Seq[Int] = {
    //TO DO return sorted Sequence of common elements in all 3 sequences
      // Seq(0)
    (s1.toSet & s2.toSet & s3.toSet).toSeq.sorted
  }

  val mySeq1 = Seq(1, 33, 14, 77, 5)
  val mySeq2 = Seq(1, 50, 33, 14, 16)
  val mySeq3 = Seq(14, 33, 20)

 println(getCommonElements(mySeq1, mySeq2, mySeq3))

  def isPangram(text: String, alphabet : String = "abcdefghijklmnopqrstuvwxyz"): Boolean= {
    //TO DO determine if the sentence contains all English letters
    //https://en.wikipedia.org/wiki/Pangram
    // (case is not important here)
    //this function should work on other languages too, if we pass it different alphabet
    alphabet.toSet.subsetOf(text.toLowerCase().toSet)
  }

  println(isPangram("The five boxing wizards jump quickly.")) //should be true
}

