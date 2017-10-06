/*
Binary search in Swift

Given an array A of n elements with values or records A0, A1, ..., An−1, sorted such that A0 ≤ A1 ≤ ... ≤ An−1, and target value T, the following subroutine uses binary search to find the index of T in A.[7]
Set L to 0 and R to n − 1.
If L > R, the search terminates as unsuccessful.
Set m (the position of the middle element) to the floor (the largest previous integer) of (L + R) / 2.
If Am < T, set L to m + 1 and go to step 2.
If Am > T, set R to m − 1 and go to step 2.
Now Am = T, the search is done; return m.
*/
func binarySearch<T: Comparable>(xs: [T], x: T) -> Int? {
  var recurse: ((Int, Int) -> Int?)!
  recurse = {(low, high) in switch (low + high) / 2 {
    case _ where high < low: return nil
    case let mid where xs[mid] > x: return recurse(low, mid - 1)
    case let mid where xs[mid] < x: return recurse(mid + 1, high)
    case let mid: return mid
  }}
  return recurse(0, xs.count - 1)
}
