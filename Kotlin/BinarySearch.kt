// Kotlin implementation of recursive Binary Search
/*

Given an array A of n elements with values or records A0, A1, ..., An−1, sorted such that A0 ≤ A1 ≤ ... ≤ An−1, and target value T, the following subroutine uses binary search to find the index of T in A.[7]
Set L to 0 and R to n − 1.
If L > R, the search terminates as unsuccessful.
Set m (the position of the middle element) to the floor (the largest previous integer) of (L + R) / 2.
If Am < T, set L to m + 1 and go to step 2.
If Am > T, set R to m − 1 and go to step 2.
Now Am = T, the search is done; return m.

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
