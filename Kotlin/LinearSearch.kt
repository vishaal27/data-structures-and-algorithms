//Kotlin has indexOf for linear search
fun main(args: Array<String>) {
    val haystack = listOf("Zig", "Zag", "Wally", "Ronald", "Bush", "Krusty", "Charlie", "Bush", "Boz", "Zag")
    val needles = listOf("Zig", "Krusty", "Washington")
    for (needle in needles){
          val index = haystack.indexOf(needle)
          if (index != -1) {
            print(index.toString(10) + " is the index of " + needle + "\n")
          } else {
            print(needle + " is not in haystack\n")
          }
    }
}
