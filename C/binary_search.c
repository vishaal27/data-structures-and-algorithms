/*
Binary Search
First sort the given array in ascending order
Instead of searching the whole array for element x here we find the middle element of the array
and compares with x.
if x is greater than middle element the we recuse the array right to middle element
else we recurse array left to middle element.
*/
#include <stdio.h>

int binarySearch(int arr[],int left,int right,int key){
  if(left <= right){
    int mid = (left+right)/2;
    if(arr[mid] == key)
    {
      return mid;
    }
    if(key > mid)
    {
      return binarySearch(arr,mid+1,right,key);
    }
    else
    {
      return binarySearch(arr,left,mid-1,key);
    }
  }
  return -1;
}

int main(int argc, char const *argv[]) {
  //sorted array
  int arr[] = {1,2,3,4,5,6,7,8,9};
  int left = 0;
  int right = sizeof(arr)/sizeof(arr[0]) - 1;
  printf("%d\n", binarySearch(arr,left,right,5));
  return 0;
}
