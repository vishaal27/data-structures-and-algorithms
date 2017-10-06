// Kotlin implementation of recursive Binary Search
/*
Given the starting point of a range, the ending point of a range, and the "secret value", implement a binary search through a sorted integer array for a certain number. Implementations can be recursive or iterative (both if you can). Print out whether or not the number was in the array afterwards. If it was, print the index also.

There are several binary search algorithms commonly seen. They differ by how they treat multiple values equal to the given value, and whether they indicate whether the element was found or not. For completeness we will present pseudocode for all of them.

All of the following code examples use an "inclusive" upper bound (i.e. high = N-1 initially). Any of the examples can be converted into an equivalent example using "exclusive" upper bound (i.e. high = N initially) by making the following simple changes (which simply increase high by 1):

change high = N-1 to high = N
change high = mid-1 to high = mid
(for recursive algorithm) change if (high < low) to if (high <= low)
(for iterative algorithm) change while (low <= high) to while (low < high)

NB: We add binary search capabilities to arrays.

*/
fun <T : Comparable<T>> Array<T>.iterativeBinarySearch(target: T): Int {
    var hi = size - 1
    var lo = 0
    while (hi >= lo) {
        val guess = lo + (hi - lo) / 2
        if (this[guess] > target) hi = guess - 1
        else if (this[guess] < target) lo = guess + 1
        else return guess
    }
    return -1
}

fun <T : Comparable<T>> Array<T>.recursiveBinarySearch(target: T, lo: Int, hi: Int): Int {
    if (hi < lo) return -1

    val guess = (hi + lo) / 2

    return if (this[guess] > target) recursiveBinarySearch(target, lo, guess - 1)
    else if (this[guess] < target) recursiveBinarySearch(target, guess + 1, hi)
    else guess
}

fun main(args: Array<String>) {
    val a = arrayOf(1, 3, 4, 5, 6, 7, 8, 9, 10)
    var target = 6
    var r = a.iterativeBinarySearch(target)
    println(if (r < 0) "$target not found" else "$target found at index $r")
    target = 250
    r = a.iterativeBinarySearch(target)
    println(if (r < 0) "$target not found" else "$target found at index $r")

    target = 6
    r = a.recursiveBinarySearch(target, 0, a.size)
    println(if (r < 0) "$target not found" else "$target found at index $r")
    target = 250
    r = a.recursiveBinarySearch(target, 0, a.size)
    println(if (r < 0) "$target not found" else "$target found at index $r")
}
