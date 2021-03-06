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
    var high = size - 1
    var low = 0
    while (high >= low) {
        val mid = low + (high - low) / 2
        if (this[mid] > target) high = mid - 1
        else if (this[mid] < target) low = mid + 1
        else return mid
    }
    return -1
}

fun <T : Comparable<T>> Array<T>.recursiveBinarySearch(target: T, low: Int, high: Int): Int {
    if (high < low) return -1

    val mid = (high + low) / 2

    return if (this[mid] > target) recursiveBinarySearch(target, low, mid - 1)
    else if (this[mid] < target) recursiveBinarySearch(target, mid + 1, high)
    else mid
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
